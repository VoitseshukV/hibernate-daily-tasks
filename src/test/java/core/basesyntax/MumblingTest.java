package core.basesyntax;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;

public class MumblingTest {
  private static final Map<String, String> data = new HashMap<>();

  @BeforeClass
  public static void beforeClass() {
    data.put("r", "R");
    data.put("ww", "W-Ww");
    data.put("abc", "A-Bb-Ccc");
    data.put("CWAT", "C-Ww-Aaa-Tttt");
    data.put("ZpglnR", "Z-Pp-Ggg-Llll-Nnnnn-Rrrrrr");
    data.put("NyffsGey", "N-Yy-Fff-Ffff-Sssss-Gggggg-Eeeeeee-Yyyyyyyy");
    data.put("HbideVbxncC", "H-Bb-Iii-Dddd-Eeeee-Vvvvvv-Bbbbbbb-Xxxxxxxx-Nnnnnnnnn-Cccccccccc-Ccccccccccc");
    data.put("", "");
  }

  @Test
  public void mumble_lettersInString() {
    for (Map.Entry<String, String> entry : data.entrySet()) {
      String input = entry.getKey();
      String expected = entry.getValue();
      String actual = Mumbling.mumble(input);
      Assert.assertEquals(String.format("Your method should return a mumble \"%s\" for the input \"%s\"\n",
        expected, input), expected, actual);
    }
  }
}
