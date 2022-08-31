package br.com.jcvpalma.courseapi.domain.controllers;

import br.com.jcvpalma.courseapi.domain.dto.CourseDTO;
import br.com.jcvpalma.courseapi.domain.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping(value="/courses")
    public List<CourseDTO> getAllCourses(){
        return courseService.getAllCourses();
    }

    @GetMapping(value="/courses/{id}")
    public CourseDTO getOneCourseById(@PathVariable() Long id) {
        return courseService.getCourse(id);
    }

    @PostMapping(value="/courses", consumes = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseStatus(value = HttpStatus.CREATED)
    public void createCourse(@RequestBody CourseDTO course){
        courseService.insertCourse(course);
    }

    @PutMapping(value="/courses/{id}", consumes = { MediaType.APPLICATION_JSON_VALUE },
            produces = { MediaType.APPLICATION_JSON_VALUE })
    public CourseDTO updateCourse(@PathVariable() Long id, @RequestBody() CourseDTO course){
        return courseService.updateCourse(id, course);
    }

    @DeleteMapping(value = "/courses/{id}", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public void deleteCourse(@PathVariable() Long id){
        courseService.deleteCourse(id);
    }
}
