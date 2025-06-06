package LinkedList.SinglyLinkedList.Q3_DeleteNode;

public class Q3_DeleteGivenNodeLeetCode {

      public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
      }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;

    }
}
