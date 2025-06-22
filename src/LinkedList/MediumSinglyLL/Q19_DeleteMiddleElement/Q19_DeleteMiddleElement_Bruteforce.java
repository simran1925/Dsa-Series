package LinkedList.MediumSinglyLL.Q19_DeleteMiddleElement;

import LinkedList.MediumSinglyLL.Node;

public class Q19_DeleteMiddleElement_Bruteforce
{
    public static Node deleteMiddle(Node head)
    {
        int count=0;
        Node slow= head;
        Node pre= slow;

        Node fast= head;
        if(head==null)
        {
            return head;
        }
        if(head.next==null)
        {
            head=null;
            return head;
        }
        while(fast!=null && fast.next!=null)
        {
            pre=slow;
            slow= slow.next;
            fast=fast.next.next;

        }

        pre.next= slow.next;
        slow= null;

        return head;
    }
    public static void printLL(Node head)
    {
        Node current= head;
        while(current!=null)
        {
            System.out.print(current.data);
            System.out.print(" ->");
            current=current.next;
        }
        System.out.println("null");
        System.out.println();
    }
    public static void main(String[] args) {
        Node head= new Node(1);
        head.next= new Node(2);
        head.next.next= new Node(3);
        head.next.next.next= new Node(4);
        Node ans = deleteMiddle(head);
        printLL(ans);
    }
}
