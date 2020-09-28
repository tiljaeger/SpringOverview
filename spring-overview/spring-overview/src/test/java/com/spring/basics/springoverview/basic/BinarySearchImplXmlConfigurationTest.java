package com.spring.basics.springoverview.basic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

// load context and run with SpringRunner
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "/applicationContext.xml")
public class BinarySearchImplXmlConfigurationTest {

  @Autowired
  BinarySearchImpl binarySearch;

  @Test
  public void test() {
    int result = binarySearch.binarySearch(new int[] {}, 5);
    assertEquals(3, result);

  }

}
