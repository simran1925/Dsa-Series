package LinkedList.MediumSinglyLL.Q15_FindLengthOfLoop;

import LinkedList.MediumSinglyLL.Node;

import java.util.HashMap;
import java.util.Map;

public class Q15_FindLengthOfLoop_Optimal
{
    public static int findLoopLength(Node head) {

        Node slow=head;
        Node fast=head;
        int count=0;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                slow=head;
                while(slow!=fast)
                {
                    count++;
                    slow=slow.next;
                }
                return count;

            }

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
