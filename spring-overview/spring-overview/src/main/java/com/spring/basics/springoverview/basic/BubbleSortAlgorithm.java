package com.spring.basics.springoverview.basic;

import org.springframework.stereotype.Service;

//@Component generic component -- can also use @Service
@Service
public class BubbleSortAlgorithm implements SortAlgorithm  {
  @Override
  public int[] sort(int[] numbers) {
    // Logic for bubble sort
    return numbers;
    
  }

}
