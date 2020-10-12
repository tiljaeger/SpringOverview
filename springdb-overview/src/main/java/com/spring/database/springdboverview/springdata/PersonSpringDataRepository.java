package com.spring.database.springdboverview.springdata;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.database.springdboverview.entity.Person;

// define spring jpa repository for class Person, primary key is an integer
public interface PersonSpringDataRepository extends JpaRepository<Person, Integer> {

}
