package LinkedList.SinglyLinkedList.Q2_InsertNode;

import java.util.Arrays;
import java.util.List;

class Node {
      String data;
      Node next;

    public Node(String data)
      {
          this.data= data;
          this.next= null;
      }
      public Node(String data, Node next)
      {
          this.data=data;
          this.next= next;
      }
}
public class Q2_InsertNode_Optimal
{

    public static Node addFirst(String data,Node head)
    {
        Node newNode = new Node(data);
           if(head==null)
           {
               head= newNode;
               return newNode;
           }
           newNode.next= head;
           head= newNode;
           return newNode;
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
        String valueToAdd= "Simran";
        head=addFirst(valueToAdd,head);
        printLL(head);

    }
}
