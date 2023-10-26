package core.basesyntax;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class DoubleCola {
  public static String getNthPerson(String[] names, int n) {
    String current = null;
    List<String> stack = new LinkedList<>(Arrays.asList(names));
    for (int i = 0; i < n; i++) {
      current = stack.get(0);
      stack.add(current);
      stack.add(current);
      stack.remove(0);
    }
    return current;
  }
}