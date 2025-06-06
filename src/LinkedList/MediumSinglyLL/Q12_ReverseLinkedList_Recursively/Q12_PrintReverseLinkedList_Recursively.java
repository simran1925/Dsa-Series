package LinkedList.MediumSinglyLL.Q12_ReverseLinkedList_Recursively;

import LinkedList.MediumSinglyLL.Node;

public class Q12_PrintReverseLinkedList_Recursively
{
    public static void printreverseList(Node head) {
        if(head ==null )
        {
            return;
        }

        printreverseList(head.next);
        System.out.print(head.data+ " ");
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
        printreverseList(head);
    }
}
