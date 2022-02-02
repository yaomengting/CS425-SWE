package edu.miu.cs.cs425.courseregistrationsys.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class AcademicBlock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String code;

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private LocalDate startDate;
    @Column(nullable = false)
    private LocalDate endDate;
    @OneToMany(mappedBy = "academicBlock")
    private Collection<CourseOffering> courseOfferings = new ArrayList<>();

    public AcademicBlock(String code, String name, LocalDate startDate, LocalDate endDate) {
        this.code = code;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public AcademicBlock(String code, String name, LocalDate startDate, LocalDate endDate, Collection<CourseOffering> courseOfferings) {
        this.code = code;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.courseOfferings = courseOfferings;
    }
}
