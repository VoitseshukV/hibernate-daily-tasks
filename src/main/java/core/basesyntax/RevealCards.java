package core.basesyntax;

import java.util.Arrays;

class RevealCards {
  public static int[] deckRevealedIncreasing(int[] deck) {
    Arrays.sort(deck);
    int[] result = new int[deck.length];
    int position = 0;
    for (int card : deck) {
      result[position] = card;
      position = nextEmpty(result, position);
    }
    return result;
  }

  private static int nextEmpty(int[] result, int currentPosition) {
    int nextPosition = currentPosition;
    int placesCount = 0;
    for (int i = 0; i < result.length; i++) {
      int index = currentPosition + i;
      if (currentPosition + i >= result.length) {
        index -= result.length;
      }
      if (result[index] == 0) {
        placesCount += 1;
        nextPosition = index;
      }
      if (placesCount == 2) {
        break;
      }
    }
    return nextPosition;
  }
}