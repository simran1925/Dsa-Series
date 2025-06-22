package LinkedList.DoublyLinkedLIstMedium.Q26_FindPairOfSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q26_FindPairOfSum_Optimal
{
    public static List<List<Integer>> findPairs(Node head, int target)
    {
        List< List<Integer>>list = new ArrayList<>();
        Node right = head;
        while(right.next!=null)
        {
            right=right.next;
        }
        Node left=head;
        while(left.data< right.data)
        {
            if(left.data+ right.data==target)
            {
                list.add(Arrays.asList(left.data,right.data));
                left=left.next;
                right=right.prev;
            }
            else if(target> left.data+ right.data)
            {
                left=left.next;
            }
            else {
                right=right.prev;
            }
        }
        return list;
    }
    public static void main(String[] args) {

            // Create the head node
            Node head = new Node(0);
            Node tail = head;

            // Append new nodes and link 'prev' pointers
            tail.next = new Node(1);
            tail.next.prev = tail;
            tail = tail.next;

            tail.next = new Node(2);
            tail.next.prev = tail;
            tail = tail.next;

            tail.next = new Node(3);
            tail.next.prev = tail;
            tail = tail.next;

            tail.next = new Node(4);
            tail.next.prev = tail;
            tail = tail.next;

            tail.next = new Node(7);
            tail.next.prev = tail;
            tail = tail.next;

            // Now you have a doubly linked list:
            // 2 <-> 3 <-> 0 <-> 1 <-> 4 <-> 7
            List<List<Integer>> ans = findPairs(head, 5);
            System.out.println(ans);
        }
}
