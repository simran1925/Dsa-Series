package LinkedList.MediumSinglyLL.Q15_FindLengthOfLoop;

import LinkedList.MediumSinglyLL.Node;

import java.util.HashMap;
import java.util.Map;

public class Q15_FindLengthOfLoop_Bruteforce
{
    public static int findLoopLength(Node head) {

        Map<Node,Integer> map= new HashMap<>();
        int count=0;
        Node current=head;
        while(current!=null)
        {
            if(map.containsKey(current))
            {
                return count-map.get(current);
            }
            map.put(current,count);
            current=current.next;
            count++;
        }
      return -1;
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
        int ans = findLoopLength(head);
        System.out.println("cycle length : "+ans);
    }
}
