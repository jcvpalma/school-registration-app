package br.com.jcvpalma.schoolregisterbff.domain.dtos;


import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class CourseDTO implements Serializable {

    private Long Id;

    private String courseName;

    private Boolean active;

}
