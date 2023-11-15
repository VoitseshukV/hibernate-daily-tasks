package core.basesyntax;

public class SinglyLinkedList {
  public static void deleteNode(ListNode node) {
    node.value = node.next.value;
    node.next = node.next.next;
  }
}