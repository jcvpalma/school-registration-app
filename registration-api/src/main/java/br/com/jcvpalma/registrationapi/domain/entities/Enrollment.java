package br.com.jcvpalma.registrationapi.domain.entities;

import lombok.*;
import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="enrollments")
public class Enrollment {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @Column(name="course_id")
    public Long courseId;

    @Column(name="student_id")
    public Long studentId;

    @Column(name="dt_enrollment")
    public Date enrollmentDate;

    public Enrollment(Long courseId, Long studentId, Date enrollmentDate) {
        this.courseId = courseId;
        this.studentId = studentId;
        this.enrollmentDate = enrollmentDate;
    }
}