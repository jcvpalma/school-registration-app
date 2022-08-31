package br.com.jcvpalma.registrationapi.domain.dto;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class EnrollmentDto implements Serializable {
    private Long id;
    private Long courseId;
    private Long studentId;
    private Date enrollmentDate;

    public EnrollmentDto(Long courseId, Long studentId, Date enrollmentDate) {
        this.courseId = courseId;
        this.studentId = studentId;
        this.enrollmentDate = enrollmentDate;
    }
}
