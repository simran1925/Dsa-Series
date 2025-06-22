package LinkedList.MediumSinglyLL.Q20_SortLL;

import LinkedList.MediumSinglyLL.Node;

public class Q20_SortLL_Optimal
{
    public static Node sortList(Node head) {
        if(head==null|| head.next==null)
        {
            return head;
        }

        Node middle= findMidElement(head);
        Node secondHead=middle.next;
        middle.next=null;
        Node firstHead= head;

        firstHead=sortList(firstHead);
        secondHead= sortList(secondHead);

        return mergeTwoLL(firstHead,secondHead);

    }

    public static Node mergeTwoLL(Node firstLL, Node secondLL)
    {
        Node dummy = new Node(-1);
        Node temp= dummy;

        while(firstLL!=null && secondLL!=null)
        {
            if(firstLL.data<=secondLL.data)
            {
                temp.next=firstLL;
                firstLL=firstLL.next;
            }
            else
            {
                temp.next=secondLL;
                secondLL= secondLL.next;
            }
            temp=temp.next;
        }
        if(firstLL!=null)
        {
            temp.next= firstLL;
        }
        if(secondLL!=null)
        {
            temp.next=secondLL;
        }
        return dummy.next;
    }
    public  static Node findMidElement(Node head)
    {
        Node slow= head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null)
        {
            slow= slow.next;
            fast=fast.next.next;
        }
        return slow;
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
        head.next= new Node(5);
        head.next.next= new Node(3);
        head.next.next.next= new Node(2);
        head.next.next.next.next= new Node(4);

        printLL(head);
        sortList(head);
        printLL(head);
    }
}
