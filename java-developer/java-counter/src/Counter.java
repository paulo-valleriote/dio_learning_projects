import java.security.InvalidParameterException;
import java.util.Scanner;

public class Counter {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Type first parameter:");
    int firstCounterValue = scanner.nextInt();
    System.out.println("Type first parameter:");
    int secondCounterValue = scanner.nextInt();
    scanner.close();

    try {
      count(firstCounterValue, secondCounterValue);
    } catch (InvalidParameterException error) {
      System.out.println(error);
    }
  }

  static void count(int firstCounterValue, int secondCounterValue) throws InvalidParameterException {
    if (firstCounterValue > secondCounterValue)
      throw new InvalidParameterException("The second counter value must be greather than first one");

    int counterStreak = secondCounterValue - firstCounterValue;
    for (int currentStreak = 0; currentStreak <= counterStreak; currentStreak++) {
      System.out.println("Printing number " + currentStreak);
    }
  }
}
