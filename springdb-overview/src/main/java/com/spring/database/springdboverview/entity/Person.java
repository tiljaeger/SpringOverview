package com.spring.database.springdboverview.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;


// person is used for jdbc implementation and also for jpa/ hibernate (@entity)
// @entity is used for hibernate/ jpa
@Entity
@NamedQuery(name="find_all_persons", query="select p from Person p")
public class Person {

  @Id
  @GeneratedValue
  private int id;

  private String name;

  private String location;

  public Person(int id, String name, String location, Date birthDate) {
    super();
    this.id = id;
    this.name = name;
    this.location = location;
    this.birthDate = birthDate;
  }

  public Person(String name, String location, Date birthDate) {
    super();
    this.name = name;
    this.location = location;
    this.birthDate = birthDate;
  }

  @Override
  public String toString() {
    return "\n Person [id=" + id + ", name=" + name + ", location=" + location + ", birthDate=" + birthDate
        + ", getId()=" + getId() + ", getName()=" + getName() + ", getLocation()=" + getLocation() + ", getBirthDate()="
        + getBirthDate() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
        + super.toString() + "]";
  }

  private Date birthDate;

  // needs default constructor
  public Person() {

  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public Date getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(Date birthDate) {
    this.birthDate = birthDate;
  }

}
