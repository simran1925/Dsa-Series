package LinkedList.MediumSinglyLL.Q10_FindMiddleElementInLL;

import LinkedList.MediumSinglyLL.Node;

public class Q10_FindMiddleElementInLL_Bruteforce
{
    public Node middleNode(Node head)
    {
        int count=0;
        Node currentNode= head;
        while(currentNode!=null)
        {
            count++;
            currentNode= currentNode.next;
        }

        int mid= count/2 + 1;
        currentNode=head;
        while(currentNode!=null)
        {
            mid= mid-1;
            if(mid==0)
            {
                break;
            }
            currentNode= currentNode.next;
        }
        return currentNode;

    }
    public static void main(String[] args) {
        Node head= new Node(1);
         head.next= new Node(2);
         head.next.next= new Node(3);
         head.next.next.next= new Node(4);
    }
}
