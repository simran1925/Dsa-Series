package LinkedList.SinglyLinkedList.Q5_SearchElementInLinkedList;

 class Node
 {
     String data;
     Node next;
     Node(String data)
     {
         this.data=data;
         this.next=null;
     }

     Node(String data, Node next)
     {
         this.data=data;
         this.next=next;
     }
 }
public class Q5_SearchElementInLinkedList
{
    public static boolean findElement(Node head, String element)
    {
        if(head==null)
        {
            System.out.println("linked list is empty");
        }
        Node currentNode= head;
        while(currentNode!=null)
        {
            if(currentNode.data.equalsIgnoreCase(element))
            {
                return true;
            }
            currentNode=currentNode.next;
        }
        return false;
    }

    public static void main(String[] args) {
        Node head = new Node("Simran");
        head.next= new Node("is");
        head.next.next= new Node("my");
        head.next.next.next= new Node("name");

        String element= "Simran";
        boolean ans =findElement(head,element);
        System.out.println(ans);

    }
}
