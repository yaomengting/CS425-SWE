package edu.miu.cs.cs425.courseregistrationsys.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class CourseOffering {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private int capacity;

    @ManyToOne
    private Faculty faculty;

    @ManyToOne
    private Course course;

    @ManyToOne
    private AcademicBlock academicBlock;


    public CourseOffering(int capacity, Faculty faculty, Course course, AcademicBlock academicBlock) {
        this.capacity = capacity;
        this.faculty = faculty;
        this.course = course;
        this.academicBlock = academicBlock;
    }



//    public int getAvailableSeats() {
//        return 0;
//    }

//    public void addRegistrationRequest(RegistrationRequest request) {
//        this.registrationRequests.add(request);
//        request.setCourseOffering(this);
//    }
//
//    public void addRegistration(Registration registration) {
//        this.registrations.add(registration);
//    }

}
