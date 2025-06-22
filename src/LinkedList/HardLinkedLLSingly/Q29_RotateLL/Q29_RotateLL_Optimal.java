package LinkedList.HardLinkedLLSingly.Q29_RotateLL;

import LinkedList.HardLinkedLLSingly.Node;

public class Q29_RotateLL_Optimal
{
    public static Node rotateRight(Node head, int k) {
        if(head==null || head.next==null || k==0)
        {
            return head;
        }
        //find length of ll and find last element
        int length=1; //(loop will be broken at last element so starting length from 1)
        Node temp= head;
        while(temp.next!=null)
        {
            length++;
            temp=temp.next;
        }
        //from cycle
        temp.next=head;

        //find tail
        int stepsToTail = length - (k%length);
        Node tail = head;
        for(int i=1;i<stepsToTail;i++)
        {
            tail = tail.next;
        }
        Node newHead = tail.next;
        tail.next = null;

        return newHead;
    }
    public static void printLL(Node head)
    {
        Node curr=head;
        while(curr!=null)
        {
            System.out.print(curr.data+ " ");
            curr=curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head= new Node(1);
        head.next= new Node(2);
        head.next.next= new Node(3);
        head.next.next.next= new Node(4);
        Node newHead= rotateRight(head,2);
        printLL(newHead);
    }
}
