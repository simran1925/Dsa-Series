package LinkedList.HardLinkedLLSingly.Q30_FlattenLinkedList;

public class Q30_FlattenLinkedList_Optimal
{
    public static ListNode mergeLists(ListNode list1, ListNode list2)
    {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        while(list1!=null && list2!=null)
        {
            if(list1.val<list2.val)
            {
                temp.child= list1;
                list1= list1.child;
            }
            else
            {
                temp.child=list2;
                list2=list2.child;
            }
            temp= temp.child;
            temp.next=null;

        }
        if(list1!=null)
        {
            temp.child= list1;
        }
        if(list2!=null)
        {
            temp.child = list2;
        }
        if(dummy.child!=null)
        {
            dummy.child.next = null;
        }
        return dummy.child;
    }
    public  static ListNode flattenLinkedList(ListNode head) {
        if(head==null || head.next ==null)
        {
            return head;
        }
        ListNode newHead = flattenLinkedList(head.next);
        head= mergeLists(head,newHead);
        return head;
    }
    //not full method to print list unflattened list
    public static void printList(ListNode head)
    {
        ListNode temp = head;
        if(head==null)
        {
            return;
        }
        while(temp!=null)
        {
            ListNode t= temp.child;
            System.out.println(temp.val);
            while(t!=null)
            {
                System.out.println(t.val);
                t= t.child;
            }
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.child= new ListNode(5);
        head.child.child= new ListNode(9);
        head.next= new ListNode(6);
        head.next.child= new ListNode(10);
        head.next.child.child= new ListNode(11);
        ListNode newHead= flattenLinkedList(head);
        printList(newHead);
    }
}
