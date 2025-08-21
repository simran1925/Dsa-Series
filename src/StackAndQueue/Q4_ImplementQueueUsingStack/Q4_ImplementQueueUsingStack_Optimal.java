package StackAndQueue.Q4_ImplementQueueUsingStack;

import java.util.Stack;

class Q
{
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2= new Stack<>();

    public void push(int n)
    {
        stack1.push(n);
    }
    public void pop()
    {
        if(stack2.isEmpty())
        {
            if(stack1.isEmpty())
            {
                System.out.println("Queue is empty");
                return;
            }
            while(!stack1.isEmpty())
            {
                stack2.push(stack1.pop());
            }
        }
        stack2.pop();
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
        if(stack2.isEmpty())
        {
            if(stack1.isEmpty())
            {
                System.out.println("Queue is empty");
                return;
            }
            while(!stack1.isEmpty())
            {
                stack2.push(stack1.pop());
            }
        }
        System.out.println("top : "+stack2.peek());
    }

    public void printQueue()
    {
        if(stack1.isEmpty() && stack2.isEmpty())
        {
            System.out.println("queue is empty");
            return;
        }
        if(!stack1.isEmpty())
        {
            for(int i: stack1)
            {
                System.out.print(i+ " ");
            }
        }
       else if(!stack2.isEmpty())
        {
            for(int i: stack2)
            {
                System.out.print(i+ " ");
            }
        }

    }

}
public class Q4_ImplementQueueUsingStack_Optimal
{
    public static void main(String[] args) {
        Q queue= new Q();
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
