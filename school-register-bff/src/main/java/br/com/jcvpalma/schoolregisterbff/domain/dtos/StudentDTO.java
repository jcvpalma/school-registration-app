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
public class StudentDTO  implements Serializable {

    private Long Id;

    private String firstName;

    private String lastName;

    private Date birthDate;

    public StudentDTO(String firstName, String lastName, Date birthDate) {
        this.birthDate = birthDate;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
