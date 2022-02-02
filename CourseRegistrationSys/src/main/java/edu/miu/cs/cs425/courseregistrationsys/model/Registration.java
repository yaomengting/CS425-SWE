package edu.miu.cs.cs425.courseregistrationsys.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(cascade = CascadeType.ALL)
    private Student student;

    @ManyToOne(cascade = CascadeType.ALL)
    private CourseOffering courseOffering;

    public Registration(Student student, CourseOffering courseOffering) {
        setStudent(student);
        this.courseOffering = courseOffering;
    }

    public void setStudent(Student student) {
        this.student = student;
        student.addRegistration(this);
    }

    public void setCourseOffering(CourseOffering courseOffering) {
        this.courseOffering = courseOffering;
        courseOffering.addRegistration(this);
    }

}
