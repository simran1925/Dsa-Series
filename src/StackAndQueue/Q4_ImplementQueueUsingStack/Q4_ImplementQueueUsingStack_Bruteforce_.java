package StackAndQueue.Q4_ImplementQueueUsingStack;

import java.util.Stack;

class queue
{
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2= new Stack<>();

    public void push(int n)
    {
        while(!stack1.isEmpty())
        {
            stack2.push(stack1.pop());
        }
        stack1.push(n);
        while (!stack2.isEmpty())
        {
            stack1.push(stack2.pop());
        }
    }
    public void pop()
    {
        if(stack1.isEmpty())
        {
            System.out.println("queue is empty");
            return;
        }

        stack1.pop();
    }

    public void getSize()
    {
        if(stack1.isEmpty())
        {
            System.out.println("queue is empty");
            return;
        }
        System.out.println("size : "+stack1.size());
    }

    public void getTop()
    {
        if(stack1.isEmpty())
        {
            System.out.println("queue is empty");
            return;
        }
        System.out.println("top : "+stack1.peek());
    }

    public void printQueue()
    {
        if(stack1.isEmpty())
        {
            System.out.println("queue is empty");
            return;
        }
        for(int i: stack1)
        {
            System.out.print(i+ " ");
        }
    }

}
public class Q4_ImplementQueueUsingStack_Bruteforce_
{
    public static void main(String[] args) {
        queue queue= new queue();
        queue.push(2);
        queue.push(5);
        queue.push(3);
        queue.printQueue();
        queue.pop();
        System.out.println("After popping one element");
        queue.printQueue();
        queue.getSize();
        queue.getTop();

        queue.pop();
        queue.pop();
        queue.pop();
        queue.pop();
    }
}
