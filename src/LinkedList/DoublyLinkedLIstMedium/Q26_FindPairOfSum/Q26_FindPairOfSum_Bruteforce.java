package LinkedList.DoublyLinkedLIstMedium.Q26_FindPairOfSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q26_FindPairOfSum_Bruteforce
{
    public static List<List<Integer>> findPairs(Node head, int target)
    {
       List< List<Integer>>list = new ArrayList<>();
        Node temp = head;
        while(temp!=null)
        {
            Node nextNode = temp.next;
            while(nextNode!=null)
            {
                if(temp.data+ nextNode.data==target)
                {
                    list.add(Arrays.asList(temp.data, nextNode.data));
                }
                nextNode=nextNode.next;
            }
            temp=temp.next;
        }
        return list;
    }
    public static void main(String[] args) {
        Node head = new Node(2);
        head.next= new Node(3);
        head.next.next=new Node(0);
        head.next.next.next=new Node(1);
        head.next.next.next.next=new Node(4);
        head.next.next.next.next.next=new Node(7);
       List<List<Integer>>ans =  findPairs(head,5);
        System.out.println(ans);
    }
}
