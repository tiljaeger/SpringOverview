package com.spring.basics.springoverview.cdi;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

// load context and run with SpringRunner for spring unit testing with java context
// @RunWith(SpringRunner.class)
// @ContextConfiguration(classes = SpringOverviewCdiApplication.class)

// for using JUnit and mockito and javacontext
@RunWith(MockitoJUnitRunner.class)
public class SomeCdiBusinessTest {

  @Mock
  SomeCdiDao daoMock;

  @InjectMocks
  SomeCdiBusiness business;

  @Test
  public void testBAsicSceario1() {
    Mockito.when(daoMock.getData()).thenReturn(new int[] {2, 4});
    assertEquals(4, business.findGreatest());
  }

  @Test
  public void testBAsicSceario2() {
    Mockito.when(daoMock.getData()).thenReturn(new int[] {});
    assertEquals(Integer.MIN_VALUE, business.findGreatest());
  }

  @Test
  public void testBAsicSceario3() {
    Mockito.when(daoMock.getData()).thenReturn(new int[] {2, 2});
    assertEquals(2, business.findGreatest());
  }
}
