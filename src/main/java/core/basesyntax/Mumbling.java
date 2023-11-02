package core.basesyntax;

public class Mumbling {
  public static String mumble(String string) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < string.length(); i++) {
      if (i > 0) {
        result.append('-');
      }
      String symbol = string.substring(i, i + 1).toLowerCase();
      result.append(symbol.toUpperCase());
      result.append(symbol.repeat(i));
    }
    return result.toString();
  }
}