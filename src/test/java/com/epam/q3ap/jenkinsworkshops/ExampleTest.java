package com.epam.q3ap.jenkinsworkshops;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class ExampleTest {

  @Test
  void shouldPassWhenRunAndNotModified() {
    // Given
    String sentence = "To pass test condition should be true, but was false";
    // When
    // Then
    assertTrue(true, sentence);
  }
}
