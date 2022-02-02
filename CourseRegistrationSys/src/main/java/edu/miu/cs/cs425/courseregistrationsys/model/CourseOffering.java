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

    @ManyToOne(cascade = CascadeType.ALL)
    private Faculty faculty;

    @ManyToOne(cascade = CascadeType.ALL)
    private Course course;

    @ManyToOne
    private AcademicBlock academicBlock;

    @OneToMany(mappedBy = "courseOffering", cascade = CascadeType.ALL)
    private Collection<RegistrationRequest> registrationRequests = new ArrayList<>();

    @OneToMany(mappedBy = "courseOffering")
    private Collection<Registration> registrations = new ArrayList<>();

    public CourseOffering(int capacity, Faculty faculty, Course course, AcademicBlock academicBlock) {
        this.capacity = capacity;
        this.faculty = faculty;
        this.course = course;
        this.academicBlock = academicBlock;
    }

    public CourseOffering(int capacity, Faculty faculty, Course course, AcademicBlock academicBlock, Collection<RegistrationRequest> registrationRequests) {
        this.capacity = capacity;
        this.faculty = faculty;
        this.course = course;
        this.academicBlock = academicBlock;
        this.registrationRequests = registrationRequests;
    }

    public int getAvailableSeats() {
        return capacity - registrations.size();
    }

    public void addRegistrationRequest(RegistrationRequest request) {
        this.registrationRequests.add(request);
        request.setCourseOffering(this);
    }

    public void addRegistration(Registration registration) {
        this.registrations.add(registration);
    }

}
