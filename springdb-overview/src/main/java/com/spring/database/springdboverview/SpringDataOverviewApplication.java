package com.spring.database.springdboverview;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.database.springdboverview.entity.Person;
import com.spring.database.springdboverview.springdata.PersonSpringDataRepository;

@SpringBootApplication
public class SpringDataOverviewApplication implements CommandLineRunner {

  private Logger logger = LoggerFactory.getLogger(SpringDataOverviewApplication.class);

  @Autowired
  PersonSpringDataRepository repository;

  public static void main(String[] args) {
    SpringApplication.run(SpringDataOverviewApplication.class, args);
  }

  public void run(String... args) throws Exception {

    logger.info("User id 10001 -> {}", repository.findById(10001));

    // instead of using insert like in JPAOverviewApplication use save
    logger.info("Inserting -> {}", repository.save(new Person("Tara", "Berlin", new Date())));

    // instead of using update like in JPAOverviewApplication use save
    logger.info("Update 10003 -> {}", repository.save(new Person(10003, "Pieter", "Utrecht", new Date())));

    repository.deleteById(10002);

    logger.info("all persons -> {}", repository.findAll());

  }
}
