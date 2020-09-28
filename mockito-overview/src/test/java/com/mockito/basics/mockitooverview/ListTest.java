package com.mockito.basics.mockitooverview;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ListTest {

  @Test
  void test() {
    List listMock = mock(List.class);

    when(listMock.size()).thenReturn(10);

    assertEquals(10, listMock.size());
    assertEquals(10, listMock.size());
  }

  @Test
  void testMultipleReturns() {
    List listMock = mock(List.class);

    when(listMock.size()).thenReturn(10).thenReturn(20);

    assertEquals(10, listMock.size());
    assertEquals(20, listMock.size());
    assertEquals(20, listMock.size());
  }

  @Test
  void testGet_Specific() {
    List listMock = mock(List.class);

    when(listMock.get(0)).thenReturn("1");

    assertEquals("1", listMock.get(0));
    assertEquals(null, listMock.get(1));
  }

  @Test
  void testGet_GenericParameter() {
    List listMock = mock(List.class);

    when(listMock.get(Mockito.anyInt())).thenReturn("SomeString");

    assertEquals("SomeString", listMock.get(0));
    assertEquals("SomeString", listMock.get(1));
  }

}
