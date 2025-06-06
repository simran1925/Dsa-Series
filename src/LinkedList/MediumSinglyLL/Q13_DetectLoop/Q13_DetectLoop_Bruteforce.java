package LinkedList.MediumSinglyLL.Q13_DetectLoop;

import LinkedList.MediumSinglyLL.Node;

import java.util.HashMap;
import java.util.Map;

public class Q13_DetectLoop_Bruteforce
{
    public static Boolean ifLoopExists(Node head) {
        if(head ==null )
        {
            return false;
        }
        Map<Node,Integer> map = new HashMap<>();
        Node current= head;
        while(current!=null)
        {
            if(map.containsKey(current))
            {
                return true;
            }
            map.put(current,1);
            current= current.next;
        }
        return false;
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

        //make a loop
        Node current= head;
        Node data= head;

        while(current.next!=null)
        {
            current=current.next;
        }
        while(data.data!=2)
        {
            data=data.next;
        }
        current.next=data;
        boolean ans = ifLoopExists(head);
        System.out.println(ans);
    }
}

