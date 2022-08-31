package br.com.jcvpalma.registrationapi.domain.service.impl;

import br.com.jcvpalma.registrationapi.domain.dto.EnrollmentDto;
import br.com.jcvpalma.registrationapi.domain.entities.Enrollment;
import br.com.jcvpalma.registrationapi.domain.repositories.RegistrationRepository;
import br.com.jcvpalma.registrationapi.domain.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    private RegistrationRepository registrationRepository;

    @Override
    public List<EnrollmentDto> getAllEnrollments() {
        return StreamSupport.stream(registrationRepository.findAll().spliterator(), false)
                .map( t -> new EnrollmentDto(t.getCourseId(), t.getStudentId(), t.getEnrollmentDate()))
                .collect(Collectors.toList());
    }

    @Override
    public EnrollmentDto getOneEnrollmentById(Long id) {
        return registrationRepository.findById(id).map(
                t -> new EnrollmentDto(t.getCourseId(), t.getStudentId(), t.getEnrollmentDate())
        ).orElse(null);
    }

    @Override
    public EnrollmentDto insertEnrollment(EnrollmentDto enroll) {
        Enrollment enr = registrationRepository.save(new Enrollment(enroll.getCourseId(), enroll.getStudentId(), enroll.getEnrollmentDate()));
        return new EnrollmentDto(enr.getCourseId(), enr.getStudentId(), enr.getEnrollmentDate());
    }

    @Override
    public EnrollmentDto updateEnrollment(Long id, EnrollmentDto enroll) {
        return registrationRepository.findById(id).map( enr -> {
            enr.setCourseId(enroll.getCourseId());
            enr.setStudentId(enroll.getStudentId());
            enr.setEnrollmentDate(enroll.getEnrollmentDate());
            registrationRepository.save(enr);
            return enroll;
        }).orElse(null);
    }

    @Override
    public Boolean deleteEnrollment(Long id) {
        return registrationRepository.findById(id).map(enr -> {
            registrationRepository.delete(enr);
            return true;
        }).orElse(false);
    }
}
