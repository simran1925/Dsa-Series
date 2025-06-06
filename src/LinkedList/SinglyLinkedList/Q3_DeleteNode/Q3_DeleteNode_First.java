package LinkedList.SinglyLinkedList.Q3_DeleteNode;

import java.util.Arrays;
import java.util.List;

public class Q3_DeleteNode_First
{
    public static Node deleteFirst(Node head)
    {
        if(head==null)
        {
            return head;
        }

        head= head.next;
        return head;

    }
    public static void printLL(Node head)
    {
        Node currentNode= head;
        if(head==null)
        {
            System.out.println("List is empty");
        }
        while(currentNode!=null)
        {
            System.out.print(currentNode.data+ "->");
            currentNode= currentNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        List<String> list= Arrays.asList("Hii", "I ", "am", "a");
        Node head = new Node(list.get(0));
        head.next= new Node(list.get(1));
        head.next.next= new Node(list.get(2));
        head.next.next.next= new Node(list.get(3));
        head=  deleteFirst(head);
        printLL(head);

    }
}
