import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

  @Test
  public void testFizzBuzzMapper() throws Exception {
    assertEquals("Test fizz", "Fizz", FizzBuzz.fizzBuzzMapper(3));
    assertEquals("Test buzz", "Buzz", FizzBuzz.fizzBuzzMapper(5));
    assertEquals("Test fizzbuzz", "FizzBuzz", FizzBuzz.fizzBuzzMapper(15));
    assertEquals("Test number", "1", FizzBuzz.fizzBuzzMapper(1));


  }
}