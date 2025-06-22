package LinkedList.HardLinkedLLSingly.Q30_FlattenLinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode child;

    ListNode() {
        val = 0;
        next = null;
        child = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
        child = null;
    }

    ListNode(int data1, ListNode next1, ListNode next2) {
        val = data1;
        next = next1;
        child = next2;
    }
}
public class Q30_FlattenLinkedList_Bruteforce
{
    public static ListNode flattenLinkedList(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        while(head!=null)
        {
            ListNode t = head.child;
            while(t!=null)
            {
                list.add(t.val)  ;
                t= t.child;
            }
            list.add(head.val);
            head = head.next;
        }

        Collections.sort(list);

        ListNode dummy = new ListNode(-1);
        ListNode temp= dummy;
        for(int i=0;i<list.size();i++)
        {
            temp.child = new ListNode(list.get(i));
            temp= temp.child;
        }
        return dummy.child;
    }
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
      head.child.child= new ListNode(6);
      head.next= new ListNode(9);
      head.next.child= new ListNode(10);
      head.next.child.child= new ListNode(11);
     ListNode newHead = flattenLinkedList(head);
     printList(newHead);
    }
}
