package edu.mum.cs.cs425.studentmgmt.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Classroom {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long classroomId;

  private String buildingName;
  private String roomNumber;


  public Classroom() {
  }

  public Classroom(String buildingName, String roomNumber) {
    
    this.buildingName = buildingName;
    this.roomNumber = roomNumber;
  }

  public long getClassroomId() {
    return this.classroomId;
  }

  public void setClassroomId(long classroomId) {
    this.classroomId = classroomId;
  }

  public String getBuildingName() {
    return this.buildingName;
  }

  public void setBuildingName(String buildingName) {
    this.buildingName = buildingName;
  }

  public String getRoomNumber() {
    return this.roomNumber;
  }

  public void setRoomNumber(String roomNumber) {
    this.roomNumber = roomNumber;
  }

  public Classroom classroomId(long classroomId) {
    setClassroomId(classroomId);
    return this;
  }

  public Classroom buildingName(String buildingName) {
    setBuildingName(buildingName);
    return this;
  }

  public Classroom roomNumber(String roomNumber) {
    setRoomNumber(roomNumber);
    return this;
  }


  @Override
  public String toString() {
    return "{" +
      " classroomId='" + getClassroomId() + "'" +
      ", buildingName='" + getBuildingName() + "'" +
      ", roomNumber='" + getRoomNumber() + "'" +
      "}";
  }


}
