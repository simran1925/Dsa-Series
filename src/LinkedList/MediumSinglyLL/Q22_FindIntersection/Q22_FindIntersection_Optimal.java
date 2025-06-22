package LinkedList.MediumSinglyLL.Q22_FindIntersection;

import LinkedList.MediumSinglyLL.Node;

public class Q22_FindIntersection_Optimal
{
    public static Node getIntersectionNode(Node headA, Node headB) {
        Node curr1=headA;
        Node curr2=headB;
        while(curr1!=curr2)
        {
            if(curr1==null)
            {
                curr1=headB;
            }
            else
            {
                curr1=curr1.next;
            }

            if(curr2==null)
            {
                curr2=headA;
            }
            else
            {
                curr2=curr2.next;
            }
        }
        return curr1;

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


        Node head2= new Node(9);
        head2.next= new Node(2);
        head2.next.next= new Node(4);
        printLL(head);

        Node curr= head;
        while(curr.data!=2)
        {
            curr=curr.next;
        }
        Node curr2 = head2;
        while(curr2.data!=2)
        {
            curr2=curr2.next;
        }
        curr.next=curr2;

        Node intersectionNode=getIntersectionNode (head,head2);
        System.out.println("Intersection point is : "+intersectionNode.data);
    }
}
