package core.basesyntax;

import java.util.Arrays;
import java.util.stream.Collectors;

public class WeightSort {
  public static String orderWeights(String weights) {
    String[] numbers = weights.trim().split("\\s+");

    return Arrays.stream(numbers)
            .sorted((o1, o2) -> digitsSum(o1) == digitsSum(o2) ? o1.compareTo(o2) : digitsSum(o1) - digitsSum(o2))
            .collect(Collectors.joining(" "));
  }

  private static int digitsSum(String number) {
    return number.chars()
            .mapToObj(value -> (char) value)
            .map(character -> Integer.parseInt("" + character))
            .mapToInt(value -> value)
            .sum();
  }
}
