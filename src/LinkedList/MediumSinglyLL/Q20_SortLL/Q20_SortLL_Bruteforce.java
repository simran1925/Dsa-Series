package LinkedList.MediumSinglyLL.Q20_SortLL;

import LinkedList.MediumSinglyLL.Node;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q20_SortLL_Bruteforce
{
    public static Node sortList(Node head) {
        if(head==null)
        {
            return head;
        }
        Node current= head;
        List<Integer> list= new ArrayList<>();

        while(current!=null)
        {
            list.add(current.data);
            current=current.next;
        }

        Collections.sort(list);
        current=head;
        int i=0;
        while(current!=null)
        {
            current.data=list.get(i);
            current=current.next;
            i++;
        }
        return head;
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
