package LinkedList.MediumSinglyLL.Q23_AddOneToANumberOfLL;

import LinkedList.MediumSinglyLL.Node;

public class Q23_AddOneToANumberOfLL_Optimal
{
    public static Node findSum(Node head,int k)
    {
        if(head==null)
        {
            return head;
        }
        Node newHead= reverseLL(head);
        int carry =0;
        Node curr=newHead;     //starting from reversed ll

        //first part (where just only add k in ll)
        int sum=0;
        sum+= curr.data+k;
        carry= sum/10;
        int num= sum%10;

        Node dummy = new Node(-1);
        Node temp= dummy;
        temp.next= new Node(num);
        temp=temp.next;
        curr=curr.next;
        System.out.println(sum);
        System.out.println(carry);
        System.out.println(num);
        sum=0;
        while(curr!=null || carry!=0 )
        {
            sum=0;
            if(curr!=null)
            {
                sum+=curr.data;
                curr=curr.next;
            }
            sum+=carry;
            num = sum%10;
            carry=sum/10;
            temp.next=new Node(num);
            temp=temp.next;
        }
        return reverseLL(dummy.next);

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
//        head.next.next.next= new Node(2);
//        head.next.next.next.next= new Node(4);

        printLL(head);
       Node newNode= findSum(head,1);
        printLL(newNode);

    }
}
