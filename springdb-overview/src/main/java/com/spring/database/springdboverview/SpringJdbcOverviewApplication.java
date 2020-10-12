package com.spring.database.springdboverview;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import com.spring.database.springdboverview.entity.Person;
import com.spring.database.springdboverview.jdbc.PersonJdbcDao;

// comment this out if you want to use some other *OverviewApplication (eg JpaOverviewApplication)
// @SpringBootApplication
public class SpringJdbcOverviewApplication implements CommandLineRunner {

  
  private Logger logger = LoggerFactory.getLogger(SpringJdbcOverviewApplication.class);

  @Autowired
  PersonJdbcDao dao;

  public static void main(String[] args) {
    SpringApplication.run(SpringJdbcOverviewApplication.class, args);
  }

  public void run(String... args) throws Exception {

    logger.info("all users -> {}", dao.findAll());
    logger.info("user id 10001 -> {}", dao.findById(10001));

    logger.info("delete user id 10002 -> number of rows deleted {}", dao.deleteById(10002));
    logger.info("Inserting 10004 -> {}", dao.insert(new Person(10004, "Inge", "Kohlhof", new Date(1940))));
    logger.info("Update 10004 -> {}", dao.update(new Person(10004, "Inge", "Kohlhof", new Date(1941))));

  }

  
}
