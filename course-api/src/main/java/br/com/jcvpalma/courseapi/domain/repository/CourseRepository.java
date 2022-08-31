package br.com.jcvpalma.courseapi.domain.repository;

import br.com.jcvpalma.courseapi.domain.entities.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends CrudRepository<Course, Long> { }
