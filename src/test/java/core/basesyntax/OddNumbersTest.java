package core.basesyntax;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class OddNumbersTest {
  private static final Map<Integer, Integer> data = new HashMap<>();

  @BeforeClass
  public static void beforeClass() {
    data.put(1, 1);
    data.put(2, 8);
    data.put(3, 27);
    data.put(4, 64);
    data.put(5, 125);
    data.put(8, 512);
    data.put(10, 1000);
    data.put(17, 4913);
    data.put(23, 12167);
    data.put(35, 42875);
  }

  @Test
  public void getWinnerWord_stringOfWords() {
    for (Map.Entry<Integer, Integer> entry : data.entrySet()) {
      int input = entry.getKey();
      int expected = entry.getValue();
      int actual = OddNumbers.getSumOfRow(input);
      Assert.assertEquals(String.format("The method should return %d for the input number %d\n",
        expected, input), expected, actual);
    }
  }
}
