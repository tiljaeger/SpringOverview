package com.spring.basics.springoverview;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.basics.springoverview.basic.BinarySearchImpl;

@Configuration
@ComponentScan("com.spring.basics.springoverview")
public class SpringOverviewBasicApplication {

  public static void main(String[] args) {

    // loosely coupling without Spring
    // BinaryearchImpl binarySearch = new BinaryearchImpl(new BubbleSortAlgorithm());
    // int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
    // System.out.println(result);

    // loosely coupling with Spring and dependency injection
    // --> use instead the spring application context to manage all the beans
    // spring Boot style
    //    ApplicationContext applicationContext = SpringApplication.run(SpringOverviewBasicApplication.class, args);

    // Spring style
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringOverviewBasicApplication.class);
    
    BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
    int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
    System.out.println(result);
    
    applicationContext.close();
  }

}
