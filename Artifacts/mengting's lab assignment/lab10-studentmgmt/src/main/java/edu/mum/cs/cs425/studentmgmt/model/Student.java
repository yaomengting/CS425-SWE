package edu.mum.cs.cs425.studentmgmt.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Student {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long studentId;
  
  @NotNull
  private String studentNumber;
  @NotNull
  private String firstName;
  private String middleName;
  @NotNull
  private String lastName;
  private double cgpa;
  private LocalDate dateOfEnrollment;
  @OneToOne
  private Transcript transcript;
  @ManyToOne
  private Classroom classroom;


  public Student() {
  }

  public Student(String studentNumber, String firstName, String middleName, String lastName, double cgpa, LocalDate dateOfEnrollment, Transcript transcript) {
    this.studentNumber = studentNumber;
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.cgpa = cgpa;
    this.dateOfEnrollment = dateOfEnrollment;
    this.transcript = transcript;
  }

  public Student(String studentNumber, String firstName, String middleName, String lastName, double cgpa, LocalDate dateOfEnrollment, Transcript transcript, Classroom classroom) {
    this.studentNumber = studentNumber;
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.cgpa = cgpa;
    this.dateOfEnrollment = dateOfEnrollment;
    this.classroom = classroom;
  }

  public long getStudentId() {
    return this.studentId;
  }

  public void setStudentId(long studentId) {
    this.studentId = studentId;
  }

  public String getStudentNumber() {
    return this.studentNumber;
  }

  public void setStudentNumber(String studentNumber) {
    this.studentNumber = studentNumber;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getMiddleName() {
    return this.middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public double getCgpa() {
    return this.cgpa;
  }

  public void setCgpa(double cgpa) {
    this.cgpa = cgpa;
  }

  public LocalDate getDateOfEnrollment() {
    return this.dateOfEnrollment;
  }

  public void setDateOfEnrollment(LocalDate dateOfEnrollment) {
    this.dateOfEnrollment = dateOfEnrollment;
  }

  public Transcript getTranscript() {
    return this.transcript;
  }

  public void setTranscript(Transcript transcript) {
    this.transcript = transcript;
  }

  public Student studentId(long studentId) {
    setStudentId(studentId);
    return this;
  }

  public Student studentNumber(String studentNumber) {
    setStudentNumber(studentNumber);
    return this;
  }

  public Student firstName(String firstName) {
    setFirstName(firstName);
    return this;
  }

  public Student middleName(String middleName) {
    setMiddleName(middleName);
    return this;
  }

  public Student lastName(String lastName) {
    setLastName(lastName);
    return this;
  }

  public Student cgpa(double cgpa) {
    setCgpa(cgpa);
    return this;
  }

  public Student dateOfEnrollment(LocalDate dateOfEnrollment) {
    setDateOfEnrollment(dateOfEnrollment);
    return this;
  }

  public Student transcript(Transcript transcript) {
    setTranscript(transcript);
    return this;
  }
  


  @Override
  public String toString() {
    return "{" +
      " studentId='" + getStudentId() + "'" +
      ", studentNumber='" + getStudentNumber() + "'" +
      ", firstName='" + getFirstName() + "'" +
      ", middleName='" + getMiddleName() + "'" +
      ", lastName='" + getLastName() + "'" +
      ", cgpa='" + getCgpa() + "'" +
      ", dateOfEnrollment='" + getDateOfEnrollment() + "'" +
      ", transcript='" + getTranscript() + "'" +
      "}";
  }
  

}
