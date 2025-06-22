package LinkedList.DoublyLinkedLIstMedium.Q25_DeleteAllOccurencesOfKey;
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
public class Q25_DeleteAllOccurencesOfKey_Optimal
{
    public static ListNode deleteAllOccurrences(ListNode head, int target)
    {
        ListNode temp = head;
        ListNode previous= null;
        ListNode next = null;
        while(temp!=null)
        {
            if(temp.val==target)
            {
                if(temp==head)
                {
                    ListNode beforeHead=head;
                    head=head.next;
                    if(head!=null)
                    {
                        head.prev=null;
                    }
                }
                else
                {
                    previous= temp.prev;
                    next=temp.next;
                    if(next!=null)
                    {
                        previous.next=next;
                        next.prev=previous;
                    }
                    else{
                        previous.next=null;
                    }
                }

            }
            temp=temp.next;
        }
        return head;
    }

    public static void main(String[] args) {

    }
}
