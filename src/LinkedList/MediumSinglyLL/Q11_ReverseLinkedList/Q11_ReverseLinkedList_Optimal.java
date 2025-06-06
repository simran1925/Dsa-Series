package LinkedList.MediumSinglyLL.Q11_ReverseLinkedList;

import LinkedList.MediumSinglyLL.Node;

public class Q11_ReverseLinkedList_Optimal
{
    public static Node reverseList(Node head) {
        if(head ==null || head.next==null)
        {
            return head;
        }
        Node current=head, prev=null, next=head;
        while(current!=null)
        {
            next= current.next;
            current.next= prev;
            prev= current;
            current= next;
        }
        return prev;
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
        reverseList(head);
        printLL(head);
    }
}
