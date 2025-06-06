package LinkedList.DoublyLinkedList.Q7_InsertionInDoublyLinkedList;

import LinkedList.DoublyLinkedList.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class Q7_InsertionInDoublyLinkedList
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
    public static Node insertNodeAtLast(Node head, int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            return head;
        }
        Node currentNode= head;
        while(currentNode.next!=null)
        {
            currentNode= currentNode.next;
        }
        currentNode.next=newNode;
        newNode.prev= currentNode;

        return newNode;
    }
    public static void main(String[] args) {
       Node head=  convertArrayListTo2DLL();
        printLL(head);
        insertNodeAtLast(head,7);
        System.out.println("after insertion");
        printLL(head);
    }
}
