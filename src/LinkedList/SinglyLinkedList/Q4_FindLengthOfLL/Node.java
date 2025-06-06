package LinkedList.SinglyLinkedList.Q4_FindLengthOfLL;

class Node {
    String data;
    Node next;

    public Node(String data)
    {
        this.data= data;
        this.next= null;
    }
    public Node(String data, Node next)
    {
        this.data=data;
        this.next= next;
    }
}
