package com.spring.basics.springoverview.cdi;

import javax.inject.Named;

@Named
// @Component
public class SomeCdiDao {

  public int[] getData() {
    return new int[] {5, 89, 100};
  }

}
