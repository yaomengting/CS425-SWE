package edu.mum.cs.cs425.studentmgmt.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Transcript {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long transcriptId;
  
  private String degreeTitle;

  @OneToOne(mappedBy = "transcript")
  private Student student;


  public Transcript() {
  }

  public Transcript(String degreeTitle) {
    this.degreeTitle = degreeTitle;
  }

  public Transcript(String degreeTitle, Student student) {
    this.degreeTitle = degreeTitle;
    this.student = student;
}

  public long getTranscriptId() {
    return this.transcriptId;
  }

  public void setTranscriptId(long transcriptId) {
    this.transcriptId = transcriptId;
  }

  public String getDegreeTitle() {
    return this.degreeTitle;
  }

  public void setDegreeTitle(String degreeTitle) {
    this.degreeTitle = degreeTitle;
  }

 

  public Student getStudent() {
    return student;
}

public void setStudent(Student student) {
    this.student = student;
}


  @Override
  public String toString() {
    return "{" +
      " transcriptId='" + getTranscriptId() + "'" +
      ", degreeTitle='" + getDegreeTitle() + "'" +
      "}";
  }


  
}
