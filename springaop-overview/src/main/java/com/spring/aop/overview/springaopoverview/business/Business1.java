package com.spring.aop.overview.springaopoverview.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.aop.overview.springaopoverview.data.Dao1;

@Service
public class Business1 {

  @Autowired
  private Dao1 dao1;

  public String calculateSomething() {
    // Business Logic
    return dao1.retrieveSomething();
  }

}
