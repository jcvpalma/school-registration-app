package br.com.jcvpalma.schoolregisterbff.domain.services.impl;

import br.com.jcvpalma.schoolregisterbff.domain.dtos.CourseDTO;
import br.com.jcvpalma.schoolregisterbff.domain.dtos.RegistrationDTO;
import br.com.jcvpalma.schoolregisterbff.domain.dtos.StudentDTO;
import br.com.jcvpalma.schoolregisterbff.domain.services.RegistrationService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Value("${bff.endpoints.student-api}")
    private String studentApiURL;

    @Value("${bff.endpoints.course-api}")
    private String courseApiURL;

    @Value("${bff.endpoints.registration-api}")
    private String registrationApiURL;

    private RestTemplate restTemplate;

    public RegistrationServiceImpl(){
        restTemplate = new RestTemplate();
    }


    @Override
    public List<StudentDTO> getStudentListByCourse(Long courseId) {
        return null;
    }

    @Override
    public List<CourseDTO> getCoursesListByStudent(Long studentId) {
        return null;
    }

    @Override
    public List<CourseDTO> getCoursesListWithoutStudents() {
        return null;
    }

    @Override
    public List<StudentDTO> getStudentListWithoutCourse() {
        return null;
    }

    @Override
    public void registerStudentAtCourse(RegistrationDTO registration) {

    }

    @Override
    public void removeStudentFromCourse(Long registrationId) {

    }
}
