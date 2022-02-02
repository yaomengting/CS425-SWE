package edu.miu.cs.cs425.courseregistrationsys.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@Entity
public class Admin extends Role{
}
