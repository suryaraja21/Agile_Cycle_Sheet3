package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest{
  @Test
  public void testGrade(){
    App app = new App();
    assertEquals('A',app.grade(90));
  }
}
