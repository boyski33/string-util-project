package com.kushlev.stringutil.core;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class StringServiceTest {

  private StringService service;

  @Before
  public void setup() {
    service = new StringService();
  }

  @Test
  public void getCorrectNumberOfWords() {
    String str = "one two three four";
    Integer expected = 4;

    Assert.assertEquals(expected, service.getNumberOfWords(str));
  }

  @Test
  public void getCorrectNumberOfSymbols() {
    String str = "abcdddd";
    Integer expected = 4;

    Assert.assertEquals(expected, service.getNumberOfSymbols(str));
  }

  @Test
  public void givenProperStringWhenInvertShouldProduceInverted() {
    String given = "abcdd";
    String expected = "ddcba";

    Assert.assertEquals(expected, service.invert(given));
  }

  @Test
  public void givenStringWithSubstringShouldReturnIndex() {
    String string = "helloworld";
    String substring = "llo";
    Integer expected = 2;

    Assert.assertEquals(expected, service.getSubstringIndex(string, substring));
  }

  @Test
  public void givenStringWithSubstringShouldReturnIndex2() {
    String string = "wwwwww";
    String substring = "ww";
    Integer expected = 0;

    Assert.assertEquals(expected, service.getSubstringIndex(string, substring));
  }

  @Test
  public void givenStringWithLongerSubstringShouldReturnDefaultValue() {
    String string = "oooow";
    String substring = "ww";
    Integer expected = -1;

    Assert.assertEquals(expected, service.getSubstringIndex(string, substring));
  }

  @Test
  public void givenStringWithSubstringShouldReturnIndex3() {
    String string = "oooow";
    String substring = "w";
    Integer expected = 4;

    Assert.assertEquals(expected, service.getSubstringIndex(string, substring));
  }

  @Test
  public void givenStringWithoutSubstringShouldReturnDefaultValue() {
    String string = "helloworld";
    String substring = "jo";
    Integer expected = -1;

    Assert.assertEquals(expected, service.getSubstringIndex(string, substring));
  }
}