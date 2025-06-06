package LinkedList.MediumSinglyLL.Q12_ReverseLinkedList_Recursively;

import LinkedList.MediumSinglyLL.Node;

public class Q12_ReverseLinkedList_Recursively
{
    public static Node reverseList(Node head) {
        if(head ==null || head.next==null)
        {
            return head;
        }
        Node newHead= reverseList(head.next);
        Node front= head.next;
        front.next=head;
        head.next=null;

        return newHead;
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
        printLL(head);
        Node newHead=reverseList(head);
        printLL(newHead);
    }
}
