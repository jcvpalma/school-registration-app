package br.com.jcvpalma.courseapi.domain.service.impl;

import br.com.jcvpalma.courseapi.domain.dto.CourseDTO;
import br.com.jcvpalma.courseapi.domain.entities.Course;
import br.com.jcvpalma.courseapi.domain.repository.CourseRepository;
import br.com.jcvpalma.courseapi.domain.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public List<CourseDTO> getAllCourses() {
        return StreamSupport.stream(courseRepository.findAll().spliterator(), false)
                .map( t -> new CourseDTO(t.getId(), t.getCourseName(), t.getActive()) ).collect(Collectors.toList());
    }

    @Override
    public CourseDTO getCourse(Long id) {
        return courseRepository.findById(id).map( t -> {
           return new CourseDTO(t.getId(), t.getCourseName(), t.getActive());
        }).orElse(new CourseDTO());
    }

    @Override
    public CourseDTO insertCourse(CourseDTO course) {
        Course csr = courseRepository.save(new Course(course.getCourseName(), course.getActive()));
        return new CourseDTO(csr.getId(), csr.getCourseName(), csr.getActive());
    }

    @Override
    public CourseDTO updateCourse(Long id, CourseDTO course) {
        return courseRepository.findById(id).map( crs -> {
            crs.setCourseName(course.getCourseName());
            crs.setActive(course.getActive());
            crs.setId(course.getId());
            courseRepository.save(crs);
            return course;
        }).orElse(null);
    }

    @Override
    public Boolean deleteCourse(Long id) {
        return courseRepository.findById(id).map( crs -> {
            courseRepository.delete(crs);
            return true;
        }).orElse(false);
    }
}
