package core.basesyntax;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class CommonSubsequence {
    @SuppressWarnings("unchecked")
    public static String getLongestCommonSubsequence(String string1, String string2) {
        List<Stack<Integer>> decisions = new LinkedList<>();
        for (char character : string1.toCharArray()) {
            int position = string2.indexOf(character);
            List<Stack<Integer>> newDecisions = new LinkedList<>();
            while (position >= 0) {
                for (Stack<Integer> decision : decisions) {
                    if (decision.peek() < position) {
                        Stack<Integer> newDecision = (Stack<Integer>) decision.clone();
                        newDecision.push(position);
                        newDecisions.add(0, newDecision);
                    }
                }
                Stack<Integer> newDecision = new Stack<>();
                newDecision.push(position);
                newDecisions.add(newDecision);
                position = string2.indexOf(character, position + 1);
            }
            decisions.addAll(newDecisions);
        }
        Stack<Integer> decision = decisions.stream()
                .min((o1, o2) -> o2.size() == o1.size()
                        ? o1.toString().compareTo(o2.toString())
                        : o2.size() - o1.size()).orElse(new Stack<>());
        StringBuilder result = new StringBuilder();
        for (Integer position : decision) {
            result.append(string2.charAt(position));
        }
        return result.toString();
    }
}
