package LinkedList.DoublyLinkedLIstMedium.Q27_RemoveDuplicateNodesOfLL;
class ListNode {
    int val;
    ListNode next;
    ListNode prev;

    ListNode() {
        val = 0;
        next = null;
        prev = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
        prev = null;
    }

    ListNode(int data1, ListNode next1, ListNode prev1) {
        val = data1;
        next = next1;
        prev = prev1;
    }
}
public class Q27_RemoveDuplicateNodesOfLL_Optimal

{
    public ListNode removeDuplicates(ListNode head)
    {
        ListNode temp= head;
        ListNode nextNode;
        while(temp!=null)
        {
            nextNode=temp.next;
            while(nextNode!=null && temp.val==nextNode.val)
            {
                nextNode= nextNode.next;
            }
            temp.next=nextNode;
            if(nextNode!=null)
            {
                nextNode.prev=temp;
            }
            temp=nextNode;
        }

        return head;

    }
}
