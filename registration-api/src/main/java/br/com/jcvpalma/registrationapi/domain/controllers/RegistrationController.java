package br.com.jcvpalma.registrationapi.domain.controllers;

import br.com.jcvpalma.registrationapi.domain.dto.EnrollmentDto;
import br.com.jcvpalma.registrationapi.domain.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @GetMapping(value="/enrollments", produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<EnrollmentDto> getAllEnrollments(){
        return registrationService.getAllEnrollments();
    }

    @GetMapping(value="/enrollments/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public EnrollmentDto getOneEnrollment(@PathVariable Long id){
        return registrationService.getOneEnrollmentById(id);
    }

    @PostMapping(value="/enrollments", consumes = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseStatus(HttpStatus.CREATED)
    public void insertEnrollment(@RequestBody() EnrollmentDto enroll){
        registrationService.insertEnrollment(enroll);
    }

    @PutMapping(value="/enrollments",  consumes = {MediaType.APPLICATION_JSON_VALUE})
    public void updateEnrollment(@PathVariable() Long id, @RequestBody() EnrollmentDto enroll){
        registrationService.updateEnrollment(id, enroll);
    }

    @DeleteMapping(value="/enrollments")
    public void deleteEnrollment(@PathVariable() Long id){
        registrationService.deleteEnrollment(id);
    }

}
