package core.basesyntax;

import org.junit.Assert;
import org.junit.Test;

public class SinglyLinkedListTest {
  @Test
  public void deleteNode_twoIntegersList() {
    ListNode value1 = new ListNode(1);
    ListNode value2 = new ListNode(2);
    value1.next = value2;
    SinglyLinkedList.deleteNode(value1);
    Assert.assertEquals("The result should be [2] for the head = [1, 2] and node = 1\n",
      2, value1.value);
  }

  @Test
  public void deleteNode_listContainsZero() {
    ListNode value1 = new ListNode(0);
    ListNode value2 = new ListNode(1);
    value1.next = value2;
    SinglyLinkedList.deleteNode(value1);
    Assert.assertEquals("The result should be [1] for the head = [0, 1] and node = 0\n",
      1, value1.value);
  }

  @Test
  public void deleteNode_negativeIntegersList() {
    ListNode value1 = new ListNode(-3);
    ListNode value2 = new ListNode(-99);
    ListNode value3 = new ListNode(-20);
    value1.next = value2;
    value2.next = value3;
    SinglyLinkedList.deleteNode(value2);
    Assert.assertEquals("The result should be [-3, -20] for the head = [-3, -99, -20] and node = -99\n",
      -20, value2.value);
  }

  @Test
  public void deleteNode_fourIntegersList() {
    ListNode value1 = new ListNode(4);
    ListNode value2 = new ListNode(5);
    ListNode value3 = new ListNode(1);
    ListNode value4 = new ListNode(9);
    value1.next = value2;
    value2.next = value3;
    value3.next = value4;
    SinglyLinkedList.deleteNode(value3);
    Assert.assertEquals("The result should be [4, 5, 9] for the head = [4, 5, 1, 9] and node = 1\n",
      9, value3.value);
  }
}
