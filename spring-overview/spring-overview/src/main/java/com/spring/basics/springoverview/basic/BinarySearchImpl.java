package com.spring.basics.springoverview.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// @Component generic component -- can also use @Service
@Service
public class BinarySearchImpl {
  
  private Logger logger = LoggerFactory.getLogger(this.getClass());
  
  @Autowired
  private SortAlgorithm sortAlgorithm;
  
  

  public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
    super();
    this.sortAlgorithm = sortAlgorithm;
  }



  public int binarySearch(int[] numbers, int numberToSearchFor) {
    // Sorting an array
    // Bubble Sort
    int[] sortedNumbers = sortAlgorithm.sort(numbers);
    System.out.println(sortAlgorithm);
    // Quick Sort
    // Search the array
    // return the result
    return 3;
 
  }
  
  @PostConstruct
  public void postConstruct() {
    logger.info("postConstruct()");
  }

  @PreDestroy
  public void preDestroy() {
    logger.info("preDestroy()");
  }
}
