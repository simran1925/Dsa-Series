package LinkedList.SinglyLinkedList.Q4_FindLengthOfLL;

public class Q4_FindSizeOfLL
{
    public static int findLengthOfLL(Node head)
    {
        int count=0;
        if(head==null)
        {
            return 0;
        }
        Node currentNode= head;
        while(currentNode!=null)
        {
            count++;
            currentNode= currentNode.next;
        }
        return count;

    }
    public static void main(String[] args) {
        Node head = new Node("Hii");
        head.next= new Node("I am");
        head.next.next= new Node("Simran");
       int length=  findLengthOfLL(head);
        System.out.println(length);

    }
}
