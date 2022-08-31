package br.com.jcvpalma.schoolregisterbff.domain.services;

import br.com.jcvpalma.schoolregisterbff.domain.dtos.CourseDTO;
import br.com.jcvpalma.schoolregisterbff.domain.dtos.RegistrationDTO;
import br.com.jcvpalma.schoolregisterbff.domain.dtos.StudentDTO;
import java.util.List;
import java.util.Optional;

public interface RegistrationService {

    List<StudentDTO> getStudentListByCourse(Long courseId);

    List<CourseDTO> getCoursesListByStudent(Long studentId);

    List<CourseDTO> getCoursesListWithoutStudents();

    List<StudentDTO> getStudentListWithoutCourse();

    void registerStudentAtCourse(RegistrationDTO registration);

    void removeStudentFromCourse(Long registrationId);

}
