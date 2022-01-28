package edu.mum.cs.cs425.studentmgmt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    @NotNull

    private String studentNumber;
    private String firstName;
    private String middleName;
    @NotNull
    private String lastName;
    private double cgpa;
    private LocalDate dateOfEnrolment;
    @OneToOne()
    @JoinColumn(name = "transcript")
    private Transcript studentTranscript;
    @ManyToOne
    @JoinColumn(name = "classromm_id", nullable = true)
    private Classroom classroom;

    public Student(String studentNumber, String firstName, String middleName, String lastName, double cgpa, LocalDate dateOfEnrolment, Transcript studentTranscript, Classroom classroom) {
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.cgpa = cgpa;
        this.dateOfEnrolment = dateOfEnrolment;
        this.studentTranscript = studentTranscript;
        this.classroom = classroom;
    }
}
