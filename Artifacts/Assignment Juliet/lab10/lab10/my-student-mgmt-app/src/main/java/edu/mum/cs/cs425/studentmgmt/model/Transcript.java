package edu.mum.cs.cs425.studentmgmt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Transcript {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transcriptId;
    private String degreeTitle;
    @OneToOne(mappedBy = "studentTranscript", cascade = CascadeType.ALL)
    private Student student;

    public Transcript(String degreeTitle, Student student){
        this.degreeTitle = degreeTitle;
        this.student=student;

    }
}
