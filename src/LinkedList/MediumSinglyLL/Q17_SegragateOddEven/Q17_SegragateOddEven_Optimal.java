package LinkedList.MediumSinglyLL.Q17_SegragateOddEven;

import LinkedList.MediumSinglyLL.Node;

public class Q17_SegragateOddEven_Optimal
{
    public static Node oddEvenList(Node head) {
        if(head==null )
        {
            return head;
        }
        if(head.next==null)
        {
            return head;
        }
        Node odd = head;
        Node even= head.next;
        Node temp= even;
        while(even!=null && even.next!=null)
        {
            odd.next= even.next;
            odd= odd.next;
            even.next= odd.next;
            even = even.next;
        }
        odd.next=temp;
        return head;
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
        Node ans = oddEvenList(head);
        printLL(ans);
    }
}
