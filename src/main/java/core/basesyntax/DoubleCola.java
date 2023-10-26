package core.basesyntax;

public class DoubleCola {
  public static String getNthPerson(String[] names, int n) {
    int iteration = 1;
    while (n > names.length * iteration) {
      n -= names.length * iteration;
      iteration <<= 1;
    }
    return names[(n - 1) / iteration];
  }
}