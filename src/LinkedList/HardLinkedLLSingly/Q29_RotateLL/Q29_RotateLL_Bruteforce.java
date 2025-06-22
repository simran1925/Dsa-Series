package LinkedList.HardLinkedLLSingly.Q29_RotateLL;

import LinkedList.HardLinkedLLSingly.Node;

public class Q29_RotateLL_Bruteforce
{
    //it is looking like an optimal solution but when I apply it on leetcode it is not accepting all the test cases

    public static Node rotateRight(Node head, int k) {
           if (head == null || head.next == null) return head;
         for (int i = 0; i < k; i++) {
           Node temp = head;
           while (temp.next.next != null) temp = temp.next;
           Node end = temp.next;
           temp.next = null;
           end.next = head;
           head = end;
         }
         return head;
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
        head.next= new Node(2);
        head.next.next= new Node(3);
        head.next.next.next= new Node(4);
        Node newHead= rotateRight(head,2);
        printLL(newHead);
    }

}
