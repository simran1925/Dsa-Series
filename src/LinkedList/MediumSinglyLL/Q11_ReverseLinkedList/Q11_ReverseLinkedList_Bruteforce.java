package LinkedList.MediumSinglyLL.Q11_ReverseLinkedList;

import LinkedList.MediumSinglyLL.Node;

import java.util.Stack;

public class Q11_ReverseLinkedList_Bruteforce
{
    public static Node reverseList(Node head) {
        if(head ==null || head.next==null)
        {
            return head;
        }
        Stack<Integer> stack = new Stack<>();
        Node current= head;
        while(current!=null)
        {
            stack.add(current.data);
            current= current.next;
        }
        current=head;
        while(current!=null)
        {
            current.data= stack.pop();
            current= current.next;
        }
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
        printLL(head);
        reverseList(head);
        printLL(head);
    }
}
