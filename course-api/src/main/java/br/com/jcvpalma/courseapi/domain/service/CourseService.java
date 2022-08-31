package br.com.jcvpalma.courseapi.domain.service;

import br.com.jcvpalma.courseapi.domain.dto.CourseDTO;
import java.util.List;

public interface CourseService {

    List<CourseDTO> getAllCourses();

    CourseDTO getCourse(Long id);

    CourseDTO insertCourse(CourseDTO course);

    CourseDTO updateCourse(Long id, CourseDTO course);

    Boolean deleteCourse(Long id);

}
