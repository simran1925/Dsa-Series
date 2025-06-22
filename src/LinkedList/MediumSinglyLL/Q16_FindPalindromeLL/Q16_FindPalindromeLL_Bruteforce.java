package LinkedList.MediumSinglyLL.Q16_FindPalindromeLL;

import LinkedList.MediumSinglyLL.Node;

import java.util.Stack;

public class Q16_FindPalindromeLL_Bruteforce
{
    public static boolean isPalindrome(Node head)
    {
        Stack<Integer> stack= new Stack<>();
        Node current= head;
        while(current!=null)
        {
            stack.push(current.data);
            current=current.next;
        }

        current=head;
        while(current!=null)
        {
            int data= stack.peek();
            if(data!=current.data)
            {
                return false;
            }
            stack.pop();
            current= current.next;
        }
        return true;
    }
    public static void main(String[] args) {
        Node head= new Node(1);
        head.next= new Node(2);
        head.next.next= new Node(3);
        head.next.next.next= new Node(4);
        boolean ans = isPalindrome(head);
        System.out.println(ans);
    }
}
