package core.basesyntax;

public class SimplePigLatin {
  public static String toSimplePigLatin(String string) {
    String[] words = string.split(" ");
    StringBuilder result = new StringBuilder();
    for (String word : words) {
      if (!result.isEmpty()) {
        result.append(" ");
      }
      char firstLetter = word.charAt(0);
      if (Character.isLetter(firstLetter)) {
        result.append(word.substring(1)).append(firstLetter).append("ay");
      } else {
        result.append(word);
      }
    }
    return result.toString();
  }
}