package br.com.jcvpalma.courseapi.domain.entities;


import lombok.*;
import javax.persistence.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long Id;

    @Column(name="course_name")
    private String courseName;

    @Column(name="active")
    private Boolean active;

    public Course(String courseName, Boolean active){
        this.courseName = courseName;
        this.active = active;
    }

}
