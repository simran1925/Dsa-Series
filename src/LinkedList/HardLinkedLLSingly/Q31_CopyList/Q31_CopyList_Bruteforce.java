package LinkedList.HardLinkedLLSingly.Q31_CopyList;

import java.util.HashMap;
import java.util.Map;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
public class Q31_CopyList_Bruteforce
{
    public static Node copyRandomList(Node head) {
        //put the copy nodes in map
        Map<Node,Node> map= new HashMap<>();
        Node temp=head;
        while(temp!=null)
        {
            map.put(temp,new Node(temp.val));
            temp= temp.next;
        }
        // link the cloned nodes and give newList

        temp=head;
        while(temp!=null)
        {
            Node clonedNode = map.get(temp);
            clonedNode.next= map.get(temp.next);
            clonedNode.random= map.get(temp.random);
            temp=temp.next;
        }

        return map.get(head);
    }
    public static void main(String[] args) {

    }
}
