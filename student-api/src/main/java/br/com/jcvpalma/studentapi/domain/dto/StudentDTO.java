package br.com.jcvpalma.studentapi.domain.dto;

import br.com.jcvpalma.studentapi.domain.entities.Student;
import lombok.*;

import java.io.Serializable;
import java.util.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class StudentDTO implements Serializable {

	private Long Id;

	private String firstName;

	private String lastName;
	
	private Date birthDate;


	public StudentDTO(String firstNameParam, String lastNameParam, Date birthDateParam) {
		this.firstName = firstNameParam;
		this.lastName = lastNameParam;
		this.birthDate = birthDateParam;
	}

	public static StudentDTO toStudentDTO(Student student){
		return new StudentDTO(student.getFirstName(), student.getLastName(), student.getBirthDate());
	}

}
