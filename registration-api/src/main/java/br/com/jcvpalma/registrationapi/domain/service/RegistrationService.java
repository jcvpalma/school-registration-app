package br.com.jcvpalma.registrationapi.domain.service;

import br.com.jcvpalma.registrationapi.domain.dto.EnrollmentDto;
import java.util.List;

public interface RegistrationService {

    List<EnrollmentDto> getAllEnrollments();

    EnrollmentDto getOneEnrollmentById(Long id);

    EnrollmentDto insertEnrollment(EnrollmentDto enroll);

    EnrollmentDto updateEnrollment(Long id, EnrollmentDto enroll);

    Boolean deleteEnrollment(Long id);
}
