package edu.miu.cs.cs425.courseregistrationsys.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class RegistrationRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private int priority;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(nullable = false)
    private CourseOffering courseOffering;

    public RegistrationRequest(int priority, Student student, CourseOffering courseOffering) {
        this.priority = priority;
        this.student = student;
        this.courseOffering = courseOffering;
    }

    public RegistrationRequest(int priority, Student student) {
        this.priority = priority;
        this.student = student;
    }
}
