package com.spring.aop.overview.springaopoverview;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.aop.overview.springaopoverview.business.Business1;
import com.spring.aop.overview.springaopoverview.business.Business2;

@SpringBootApplication
public class SpringaopOverviewApplication implements CommandLineRunner {

  Logger logger = LoggerFactory.getLogger(this.getClass());

  @Autowired
  Business1 business1;

  @Autowired
  Business2 business2;

  public static void main(String[] args) {
    SpringApplication.run(SpringaopOverviewApplication.class, args);
  }

  public void run(String... args) throws Exception {
    logger.info(business1.calculateSomething());
    logger.info(business2.calculateSomething());
  }

}
