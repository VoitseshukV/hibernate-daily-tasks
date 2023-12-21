package core.basesyntax;

public class OddNumbers {
    public static int getSumOfRow(int n) {
        int firstNumber = n * (n - 1) + 1;
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += firstNumber + 2 * i;
        }
        return result;
    }
}
