package LinkedList.HardLinkedLLSingly.Q31_CopyList;

public class Q31_CopyLisr_Optimal
{
    public  static Node copyRandomList(Node head) {
        //step 1 is insert a node in between the nodes of actual ll
        Node temp= head;
        while(temp!=null)
        {
            Node newNode = new Node(temp.val);
            newNode.next=temp.next;
            temp.next=newNode;
            temp= temp.next.next;
        }

        //step 2nd : do random pointer links

        temp=head;
        while(temp!=null)
        {
            Node copyNode = temp.next;
            if(temp.random!=null)
            {
                copyNode.random= temp.random.next;
            }
            temp= temp.next.next;
        }

        //3rd step is to break the links and make separate lls
        temp=head;
        Node dummy = new Node(-1);
        Node result= dummy;
        while(temp!=null)
        {
            result.next=temp.next;
            result = result.next;

            temp.next=temp.next.next;
            temp= temp.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {

    }
}
