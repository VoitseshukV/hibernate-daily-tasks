package core.basesyntax;

public class SquareMatrixMultiplication {
  public static int[][] multiplySquareMatrices(int[][] a, int[][] b) {
    int[][] result = new int[a.length][a.length];
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length; j++) {
        result[i][j] = 0;
        for (int k = 0; k < a.length; k++) {
          result[i][j] += a[i][k] * b[k][j];
        }
      }
    }
    return result;
  }
}