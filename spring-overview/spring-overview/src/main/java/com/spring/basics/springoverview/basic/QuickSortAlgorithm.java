package com.spring.basics.springoverview.basic;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//@Component generic component -- can also use @Service
@Service
@Primary
public class QuickSortAlgorithm implements SortAlgorithm {

  @Override
  public int[] sort(int[] numbers) {
    // Logic for quick sort
    return numbers;
    
  }
}
