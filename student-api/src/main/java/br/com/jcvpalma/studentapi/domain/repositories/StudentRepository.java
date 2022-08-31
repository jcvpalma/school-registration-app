package br.com.jcvpalma.studentapi.domain.repositories;

import br.com.jcvpalma.studentapi.domain.dto.StudentDTO;
import br.com.jcvpalma.studentapi.domain.entities.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

}
