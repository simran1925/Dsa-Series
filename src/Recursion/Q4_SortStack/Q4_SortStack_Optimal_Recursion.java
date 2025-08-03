package Recursion.Q4_SortStack;

import java.util.Stack;

public class Q4_SortStack_Optimal_Recursion
{
    public static void sortStack (Stack<Integer> stack){
        if(!stack.isEmpty())
        {
            int popped =stack.pop();
            sortStack(stack);
            insertElementsToStack(stack,popped);

        }
    }

    public static void insertElementsToStack(Stack<Integer> stack, int element)
    {
        if(stack.isEmpty() || stack.peek()<=element)
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

        sortStack(stack);
        System.out.println(stack);

    }
}
