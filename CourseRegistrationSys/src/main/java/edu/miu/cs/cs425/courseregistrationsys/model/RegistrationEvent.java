package edu.miu.cs.cs425.courseregistrationsys.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Getter
@Setter
@EqualsAndHashCode(exclude = {"registrationGroups", "registrationRequests"})
@NoArgsConstructor
public class RegistrationEvent {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(nullable = false)
    private LocalDate startDate;
    @Column(nullable = false)
    private LocalDate endDate;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "registrationRequestId")
    private Collection<RegistrationRequest> registrationRequests = new ArrayList<>();

    public RegistrationEvent(LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
