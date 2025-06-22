package LinkedList.MediumSinglyLL.Q22_FindIntersection;

import LinkedList.MediumSinglyLL.Node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q22_FindIntersection_Bruteforc
{
    public static Node getIntersectionNode(Node headA, Node headB) {

        // here we can use the hashSet or arrayList also but keep in mind always to store the Node instead of data in arrayList or set
        //BEST WOULD BE HASHSET TO USE
        Map<Node,Integer> map = new HashMap<>();
        Node curr= headA;
        while(curr!=null)
        {
            map.put(curr,1);
            curr=curr.next;
        }

        curr=headB;
        while(curr!=null)
        {
            if(map.containsKey(curr))
            {
                return curr;
            }
            curr=curr.next;
        }
        return null;
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
