package br.com.jcvpalma.schoolregisterbff.domain.dtos;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class RegistrationDTO  implements Serializable {

    private Long Id;

    private StudentDTO student;

    private CourseDTO course;

    private Date registrationDate;

    public RegistrationDTO(StudentDTO student, CourseDTO course, Date registrationDate){
        this.student = student;
        this.course = course;
        this.registrationDate = registrationDate;
    }

}
