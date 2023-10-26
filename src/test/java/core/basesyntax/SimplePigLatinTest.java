package core.basesyntax;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class SimplePigLatinTest {
  private static final Map<String, String> data = new HashMap<>();

  @BeforeClass
  public static void beforeClass() {
    data.put("d", "day");
    data.put("b", "bay");
    data.put("word", "ordway");
    data.put("Uppercase", "ppercaseUay");
    data.put("Test this", "estTay histay");
    data.put("The sentence of five words", "heTay entencesay foay ivefay ordsway");
    data.put("Mate academy !", "ateMay cademyaay !");
    data.put("Veni , vidi , vici", "eniVay , idivay , icivay");
    data.put("?", "?");
  }

  @Test
  public void toSimplePigLatin_convertInput() {
    for (Map.Entry<String, String> entry : data.entrySet()) {
      String input = entry.getKey();
      String expected = entry.getValue();
      String actual = SimplePigLatin.toSimplePigLatin(input);
      Assert.assertEquals(String.format("The result should be \"%s\" for the input string \"%s\"\n",
        expected, input), expected, actual);
    }
  }
}
