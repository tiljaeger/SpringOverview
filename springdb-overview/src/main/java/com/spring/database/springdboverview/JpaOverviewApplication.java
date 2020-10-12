package com.spring.database.springdboverview;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import com.spring.database.springdboverview.entity.Person;
import com.spring.database.springdboverview.jpa.PersonJpaRepository;

//comment this out if you want to use some other *OverviewApplication '(eg SpringDataOverviewApplication)
//@SpringBootApplication
public class JpaOverviewApplication implements CommandLineRunner {

  private Logger logger = LoggerFactory.getLogger(JpaOverviewApplication.class);

  @Autowired
  PersonJpaRepository repository;

  public static void main(String[] args) {
    SpringApplication.run(JpaOverviewApplication.class, args);
  }

  public void run(String... args) throws Exception {

    logger.info("User id 10001 -> {}", repository.findById(10001));

    logger.info("Inserting -> {}", repository.insert(new Person("Tara", "Berlin", new Date())));

    logger.info("Update 10003 -> {}", repository.update(new Person(10003, "Pieter", "Utrecht", new Date())));

    repository.deleteById(10002);

    logger.info("all persons -> {}", repository.findAll());

  }
}
