package StackAndQueue.Q6_ImplementQueueUsingLL;
class Node
{
    int data;
    Node next;
    public Node(int data)
    {
        this.data=data;
        this.next=null;
    }

    public Node(int data, Node node)
    {
        this.data=data;
        this.next=node;
    }
}

class queue{
    int size;
    Node front=null;    //first element
    Node rear = null;   //last element

    public void push(int n)
    {
        Node newNode = new Node(n);
        if(front==null)
        {
            front=newNode;
            rear=newNode;
        }
        else {
            rear.next=newNode;
            rear = newNode;
        }
        size++;
    }

    public void pop()
    {
        if(front==null)
        {
            System.out.println("LL is empty");
            return;
        }
        Node temp = front;
        front=front.next;
        temp.next=null ;    //delete the front element
        size--;
    }

    public void printQueue()
    {
        if(front==null)
        {
            System.out.println("Queue is empty");
            return;
        }
        Node temp= front;
       while (temp!=null)
       {
           System.out.print(temp.data + "->");
           temp= temp.next;
       }
        System.out.print("null");
    }

    public void getSize()
    {
        System.out.println("Size of Queue is : "+ size);
    }

    public void getTop()
    {
        if(front==null)
        {
            System.out.println("Queeu is empty");
            return;
        }
        System.out.println("Front element in queue is : "+ front.data);
    }

}
public class Q6_ImplementQueueUsingLL
{
    public static void main(String[] args) {


        queue queue= new queue();
        queue.push(6);
        queue.push(7);
        queue.push(8);
        queue.push(9);

        System.out.println("Printing queue");
        queue.printQueue();
        queue.pop();
        System.out.println("Printing queue after popping one element");
        queue.printQueue();
        queue.getSize();
        queue.getTop();

        queue.pop();
        queue.pop();
        queue.pop();
        queue.pop();
    }
}
