package StackAndQueue.Q3_ImplementStackUsingQueue;

import java.util.LinkedList;
import java.util.Queue;

class  stack
{
    Queue<Integer> queue = new LinkedList<>();
    public void push(int n)
    {
        queue.add(n);
        for(int i=0;i<queue.size()-1;i++)
        {
            queue.add(queue.remove());
        }

    }

    public void pop()
    {
        if(!queue.isEmpty())
        {
            queue.remove();
        }
        else {
            System.out.println("Stack is empty");
        }
    }

    public void printStack()
    {
        if(queue.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        for(int i: queue)
        {
            System.out.print(i + " ");
        }

    }
    public void getSize()
    {
        System.out.println("Size of stack is "+queue.size());
    }

    public void getTop()
    {
        if(queue.isEmpty())
        {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Top of Stack is: "+ queue.peek());
    }
}
public class Q3_ImplementStackUsingQueue
{

    public static void main(String[] args) {
      stack stack= new stack();
      stack.push(4);
      stack.push(9);
      stack.push(10);
      stack.printStack();
      stack.pop();
        System.out.println("Printing stack after popping one element");
        stack.printStack();
        stack.getSize();
        stack.getTop();
        stack.pop();
        stack.pop();
        System.out.println("Printing the stack after popping all the elements in stack");
        stack.printStack();
    }
}
