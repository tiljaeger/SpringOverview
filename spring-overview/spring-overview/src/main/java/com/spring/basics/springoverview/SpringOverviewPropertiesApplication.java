package com.spring.basics.springoverview;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.spring.basics.properties.SomeExternalService;

@Configuration
@PropertySource("classpath:app.properties")
public class SpringOverviewPropertiesApplication {

  public static void main(String[] args) {

    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringOverviewPropertiesApplication.class);
    
    SomeExternalService service = applicationContext.getBean(SomeExternalService.class);
    System.out.println(service.returnServiceUrl());
    
    applicationContext.close();
  }

}
