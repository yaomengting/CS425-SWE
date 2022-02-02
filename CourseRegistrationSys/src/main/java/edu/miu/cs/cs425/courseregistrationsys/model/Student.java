package edu.miu.cs.cs425.courseregistrationsys.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;

@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Student extends Role{

    @Column(nullable = false, unique = true)
    private String studentId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @OneToMany(mappedBy = "student", fetch = FetchType.EAGER)
    private Collection<RegistrationRequest> registrationRequests;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private Collection<Registration> registrations;

    public Student(String studentId, String name, String email) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
    }

    public Student(String studentId, String name, String email, Collection<RegistrationRequest> registrationRequests, Collection<Registration> registrations) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.registrationRequests = registrationRequests;
        this.registrations = registrations;
    }

    public void addRegistration(Registration registration) {
        this.registrations.add(registration);
    }
}
