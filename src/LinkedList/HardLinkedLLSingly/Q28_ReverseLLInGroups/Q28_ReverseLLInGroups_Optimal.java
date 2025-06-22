package LinkedList.HardLinkedLLSingly.Q28_ReverseLLInGroups;

import LinkedList.HardLinkedLLSingly.Node;

public class Q28_ReverseLLInGroups_Optimal
{
    public static Node findKthNode(Node head, int k) {
        Node temp = head;
        k -= 1;
        while (temp != null && k != 0) {
            temp = temp.next;
            k--;
        }
        return temp;
    }

    public static Node findReverse(Node head) {
        Node temp = head;

        // Initialize pointer 'prev' to NULL,
        // representing the previous node
        Node prev = null;

        // Traverse the list, continue till
        // 'temp' reaches the end (NULL)
        while (temp != null) {
            // Store the next node in
            // 'front' to preserve the reference
            Node front = temp.next;

            // Reverse the direction of the
            // current node's 'next' pointer
            // to point to 'prev'
            temp.next = prev;

            // Move 'prev' to the current
            // node for the next iteration
            prev = temp;

            // Move 'temp' to the 'front' node
            // advancing the traversal
            temp = front;
        }

        // Return the new head of
        // the reversed linked list
        return prev;
    }

    public static Node reverseKGroup(Node head, int k) {
        Node temp = head;
        Node previous = null;
        Node nextNode = null;
        while (temp != null) {
            Node kthNode = findKthNode(temp, k);
            if (kthNode == null) {
                if (previous != null) {
                    previous.next = temp;
                }
                break;
            }

            nextNode = kthNode.next;
            kthNode.next = null;
            findReverse(temp);

            if (head == temp) {
                head = kthNode;
            } else {
                previous.next = kthNode;
            }
            previous = temp;
            temp = nextNode;
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
        Node newHead= reverseKGroup(head,2);
        printLL(newHead);
    }
}
