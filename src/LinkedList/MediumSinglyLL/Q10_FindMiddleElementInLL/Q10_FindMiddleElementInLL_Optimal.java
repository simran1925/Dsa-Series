package LinkedList.MediumSinglyLL.Q10_FindMiddleElementInLL;

import LinkedList.MediumSinglyLL.Node;

public class Q10_FindMiddleElementInLL_Optimal
{
    public static Node middleNode(Node head)
    {
        Node slow= head;
        Node fast= head;
        while(fast!=null && fast.next!=null && slow!=null)
        {
            slow= slow.next;
            fast= fast.next.next;
        }
        return slow;

    }
    public static void main(String[] args) {
        Node head= new Node(1);
        head.next= new Node(2);
        head.next.next= new Node(3);
        head.next.next.next= new Node(4);

        System.out.println(middleNode(head).data);
    }
}
