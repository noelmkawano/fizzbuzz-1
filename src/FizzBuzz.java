/**
 * Created by johnson on 12/30/14.
 */
public class FizzBuzz {
  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
      System.out.println(fizzBuzzMapper(i));
    }
  }

  public static String fizzBuzzMapper(int i) {
    if (((i % 3) == 0) && ((i % 5) == 0)) {
      return "FizzBuzz";
    }
    else if ((i % 5) == 0) {
      return "Buzz";
    }
    else if ((i % 3) == 0) {
      return "Fizz";
    }
    else {
      return Integer.toString(i);
    }
  }
}
