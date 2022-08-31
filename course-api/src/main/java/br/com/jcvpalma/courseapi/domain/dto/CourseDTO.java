package br.com.jcvpalma.courseapi.domain.dto;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Data
public class CourseDTO implements Serializable {
    private Long Id;
    private String courseName;
    private Boolean active;
}
