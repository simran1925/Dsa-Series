package LinkedList.SinglyLinkedList.Q3_DeleteNode;
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
public class Q3_DeleteLastNode
{
    public static Node deleteLast(Node head)
    {
        if(head==null)
        {
            return head;
        }
        if (head.next==null)
        {
            head=null;
            return head;
        }
        Node lastNode = head.next;
        Node secondLastNode = head;
        while(lastNode.next!=null)
        {
            lastNode= lastNode.next;
            secondLastNode= secondLastNode.next;
        }
        secondLastNode.next= null;
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
        deleteLast(head);
        printLL(head);

    }
}
