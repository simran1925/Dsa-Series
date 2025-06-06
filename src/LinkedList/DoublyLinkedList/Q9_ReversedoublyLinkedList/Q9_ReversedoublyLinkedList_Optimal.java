package LinkedList.DoublyLinkedList.Q9_ReversedoublyLinkedList;

import LinkedList.DoublyLinkedList.Node;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Q9_ReversedoublyLinkedList_Optimal
{
    public static Node convertArrayListTo2DLL()
    {
        List<Integer> arrayList= Arrays.asList(1,2,3,4,5);

        Node head= new Node(arrayList.get(0));
        Node prev= head;

        for(int i=1;i<arrayList.size();i++)
        {
            Node temp = new Node(arrayList.get(i), null, prev);
            prev.next= temp;
            prev= temp;
        }
        return head;
    }

    public static void printLL(Node head)
    {
        Node currentNode= head;
        while(currentNode!=null)
        {
            System.out.print(currentNode.data+ " ->");
            currentNode= currentNode.next;
        }
    }
    public static Node reverseList(Node head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        Node prev=null;

        Node currentNode= head;
        while(currentNode!=null)
        {
            prev= currentNode.prev;
            currentNode.prev= currentNode.next;
            currentNode.next= prev;

            currentNode= currentNode.prev;
        }
        return prev.prev;
    }
    public static void main(String[] args) {
        Node head= convertArrayListTo2DLL();
        printLL(head);
        Node newHead=reverseList(head);
        System.out.println();
        printLL(newHead);
    }
}
