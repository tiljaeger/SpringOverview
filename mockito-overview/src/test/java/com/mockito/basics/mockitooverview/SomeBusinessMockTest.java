package com.mockito.basics.mockitooverview;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class SomeBusinessMockTest {

  @Test
  void testFindGreatestFromAllData1() {
    
    DataService dataServiceMock = mock(DataService.class);
    
    when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24, 15, 12});
    SomeBusinessImpl business = new SomeBusinessImpl(dataServiceMock);
    
    assertEquals(24, business.findGreatestFromAllData());
  }

  @Test
  void testFindGreatestFromAllData2() {
    
    DataService dataServiceMock = mock(DataService.class);
    
    when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {15});
    SomeBusinessImpl business = new SomeBusinessImpl(dataServiceMock);
    
    assertEquals(15, business.findGreatestFromAllData());
  }

}
