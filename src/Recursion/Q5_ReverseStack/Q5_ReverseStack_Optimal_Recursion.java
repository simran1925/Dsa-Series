package Recursion.Q5_ReverseStack;

import java.util.Stack;

public class Q5_ReverseStack_Optimal_Recursion
{


    public static void reverseStack(Stack<Integer> stack) {

        if (!stack.isEmpty())
        {
           int popped =  stack.pop();
           reverseStack(stack);
           insertElementsToStack(stack,popped);
        }
    }

    public static void insertElementsToStack(Stack<Integer> stack, int element)
    {
        if(stack.isEmpty())
        {
            stack.push(element);
        }
        else {
            int popped = stack.pop();
            insertElementsToStack(stack,element);
            stack.push(popped);
        }
    }
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();
        stack.add(4);
        stack.add(2);
        stack.add(3);
        stack.add(1);

        reverseStack(stack);
        System.out.println(stack);

    }
}
