package br.com.jcvpalma.studentapi.domain.controllers;

import br.com.jcvpalma.studentapi.domain.dto.StudentDTO;
import br.com.jcvpalma.studentapi.domain.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping(value="/students", produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<StudentDTO> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping(value="/students/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public StudentDTO getOneStudent(@PathVariable Long id){
        return studentService.getOneStudent(id);
    }

    @PutMapping(value="/students/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE},
            consumes = {MediaType.APPLICATION_JSON_VALUE})
    public StudentDTO updateStudent(@RequestBody StudentDTO student,
                                 @PathVariable Long id){
         return studentService.updateStudent(student, id);
    }

    @PostMapping(value="/students",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseStatus(value = HttpStatus.CREATED)
    public void insertStudent(@RequestBody StudentDTO student){
        studentService.insertStudent(student);
    }

    @DeleteMapping(value="/students/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public void deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
    }

}
