package edu.miu.cs.cs425.courseregistrationsys.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Arrays;
import java.util.stream.Collectors;

@EqualsAndHashCode(callSuper = true)
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Faculty extends Role{
    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    private String title;

    public Faculty(String name, String email, String title) {
        this.name = name;
        this.email = email;
        this.title = title;
    }

}
