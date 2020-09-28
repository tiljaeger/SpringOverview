package com.mockito.basics.mockitooverview;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SomeBusinessStubTest {

  @Test
  void testFindGreatestFromAllData() {
    SomeBusinessImpl business = new SomeBusinessImpl(new DataServiceStub());
    assertEquals(24, business.findGreatestFromAllData());
  }

}

// using a mock and mot mockito
class DataServiceStub implements DataService {

  public int[] retrieveAllData() {
    return new int[] {24, 12, 15};
  }

}
