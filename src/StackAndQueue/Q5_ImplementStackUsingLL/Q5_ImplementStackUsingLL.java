package StackAndQueue.Q5_ImplementStackUsingLL;

class Node
{
    int data;
    Node next;
    public Node(int data)
    {
        this.data=data;
        this.next=null;
    }

    public Node(int data,Node node)
    {
        this.data=data;
        this.next=node;
    }
}

class stack{
    int size;    //here size will not be static it can be dynamic (it is its benefit)
    Node top=null;

    public void push(int n)
    {
        Node newNode= new Node(n);
        newNode.next=top;
        top=newNode;
        size++;
    }

    public void pop()
    {
        if(top==null)
        {
            System.out.println("Stack is empty");
            return;
        }
        Node temp = top;
        top= top.next;
        temp.next=null;
        size--;
    }

    public void printStack()
    {
        Node current = top;
        while (current!=null)
        {
            System.out.print(current.data+ "->");
            current=current.next;
        }
        System.out.println("null");
    }

    public void getSize()
    {
        System.out.println("Size of stack is "+ size);
        return;
    }

    public void getTop()
    {
        if(top==null)
        {
            System.out.println("stack is empty");
            return;
        }
        System.out.println("top element of stack is "+top.data);
    }

}
public class Q5_ImplementStackUsingLL
{
    public static void main(String[] args) {
         stack stack= new stack();
         stack.push(3);
         stack.push(4);
         stack.push(5);
         stack.printStack();
         stack.pop();
         stack.getSize();
         stack.getTop();
         System.out.println("stack after popping top");
         stack.printStack();
         stack.pop();
         stack.pop();
         stack.pop();
    }
}
