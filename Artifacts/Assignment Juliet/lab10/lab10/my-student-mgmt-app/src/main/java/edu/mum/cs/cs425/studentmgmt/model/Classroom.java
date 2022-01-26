package edu.mum.cs.cs425.studentmgmt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long classroomId;
    private String buildingName;
    private String roomNumber;
    @OneToMany(mappedBy = "classroom", cascade = CascadeType.PERSIST)
    private List<Student> students;

    public Classroom(String buildingName, String roomNumber, List<Student> students) {
        this.buildingName = buildingName;
        this.roomNumber = roomNumber;
        this.students = students;
    }
}
