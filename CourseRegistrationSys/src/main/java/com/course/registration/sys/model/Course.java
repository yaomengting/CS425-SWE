package com.course.registration.sys.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Course {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String description;

    private String prerequsite;





    public Course(Long id, String name, String description, String prerequsite) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.prerequsite = prerequsite;
    }
}
