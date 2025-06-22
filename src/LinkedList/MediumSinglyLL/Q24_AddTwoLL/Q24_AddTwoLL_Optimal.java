package LinkedList.MediumSinglyLL.Q24_AddTwoLL;

import LinkedList.MediumSinglyLL.Node;

public class Q24_AddTwoLL_Optimal
{
    public static Node addTwoNumbers(Node l1, Node l2)
    {
        Node dummy = new Node(-1);
        Node temp=dummy;
        int carry =0;
        while(l1!=null || l2!=null || carry!=0)
        {
            int sum=0;
            if(l1!=null)
            {
                sum+=l1.data;
                l1=l1.next;
            }
            if(l2!=null)
            {
                sum+=l2.data;
                l2=l2.next;
            }
            sum+=carry;
            temp.next= new Node(sum%10);
            carry = sum/10;
            temp=temp.next;
        }
        return dummy.next;

    }
    public static Node reverseLL(Node head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        Node newHead= reverseLL(head.next);
        Node front= head.next;
        front.next=head;
        head.next=null;
        return newHead;
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
        head.next.next= new Node(9);

        Node head2= new Node(9);
        head2.next= new Node(2);
        head2.next.next= new Node(4);

        System.out.print("1st list ");printLL(head);
        System.out.print("2nd list ");printLL(head2);
        Node newNode= addTwoNumbers(head,head2);
        printLL(newNode);

    }
}
