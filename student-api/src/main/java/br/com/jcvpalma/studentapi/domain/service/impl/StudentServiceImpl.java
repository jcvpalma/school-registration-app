package br.com.jcvpalma.studentapi.domain.service.impl;

import java.util.*;
import java.util.stream.StreamSupport;

import br.com.jcvpalma.studentapi.domain.entities.Student;
import br.com.jcvpalma.studentapi.domain.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jcvpalma.studentapi.domain.dto.*;
import br.com.jcvpalma.studentapi.domain.service.StudentService;

import static java.util.stream.Collectors.toList;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<StudentDTO> getAllStudents() {
		return StreamSupport.stream(studentRepository.findAll().spliterator(), false)
				.map( std -> { return new StudentDTO(std.getFirstName(), std.getLastName(), std.getBirthDate()); })
				.collect(toList());
	}

	@Override
	public StudentDTO getOneStudent(Long studentId) {
		// TODO Auto-generated method stub
		return studentRepository.findById(studentId)
				.map( x -> {
					return new StudentDTO(
							x.getFirstName(),
							x.getLastName(),
							x.getBirthDate()
					);
				}).orElse(null);
	}

	@Override
	public StudentDTO updateStudent(StudentDTO student, Long studentId) {
		StudentDTO stud;
		return studentRepository.findById(studentId)
				.map( std -> {
					std.setBirthDate(student.getBirthDate());
					std.setFirstName(student.getFirstName());
					std.setLastName(student.getLastName());
					studentRepository.save(std);
					return student;
				}).orElse(null);
	}

	@Override
	public StudentDTO insertStudent(StudentDTO student) {
		Student std = studentRepository.save(new Student(
				student.getFirstName(),
				student.getLastName(),
				student.getBirthDate()
		));
		return new StudentDTO(std.getFirstName(), std.getLastName(), std.getBirthDate());
	}

	@Override
	public Boolean deleteStudent(Long studentId) {
		return studentRepository.findById(studentId)
				.map( std -> {
					studentRepository.delete(std);
					return true;
				}).orElse(false);
	}

}
