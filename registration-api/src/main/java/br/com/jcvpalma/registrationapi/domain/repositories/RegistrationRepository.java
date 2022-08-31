package br.com.jcvpalma.registrationapi.domain.repositories;

import br.com.jcvpalma.registrationapi.domain.entities.Enrollment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface RegistrationRepository extends CrudRepository<Enrollment, Long> {

    List<Enrollment> findByCourseId(Long courseId);

    List<Enrollment> findByStudentId(Long studentId);

}
