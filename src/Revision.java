import java.util.*;

class queue {
    int size ;
    Stack<Integer> stack1= new Stack<>() ;
    Stack<Integer> stack2= new Stack<>() ;
    public void push(int n)
    {
        stack1.push(n);
    }

    public void printQueue()
    {
        if(stack2.isEmpty() && stack1.isEmpty())
        {
            System.out.println("Queue is empty");
            return ;
        }
        if(!stack1.isEmpty())
        {
            for (Integer element : stack1) {
                System.out.println(element);
            }
        }
        else {
            for (Integer element : stack2) {
                System.out.println(element);
            }
        }

    }

    public void pop()   //it can be O(N) or O(1)
    {
        if(stack2.isEmpty())
        {
            while (!stack1.isEmpty())
            {
                stack2.push(stack1.peek());
                stack1.pop();
            }
        }
        stack2.pop() ; //the peek element of stack 2 (actually the front element)
    }

    public int getTop()  //O(n) or O(1)
    {
       if(stack2.isEmpty())
       {
           while (!stack1.isEmpty())
           {
               stack2.push(stack1.peek());
               stack1.pop();
           }
       }
       return stack2.peek();
    }

}
public class Revision
{

    public static void main(String[] args) {
        queue queue= new queue();
        queue.push(3);
        queue.push(4);
        queue.push(5);
        queue.printQueue();
        System.out.println(queue.getTop());

        queue.pop();
        System.out.println(queue.getTop());
        queue.printQueue();
    }

}
