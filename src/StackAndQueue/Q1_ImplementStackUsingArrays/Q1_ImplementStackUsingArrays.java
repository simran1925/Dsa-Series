package StackAndQueue.Q1_ImplementStackUsingArrays;
 class stack{
     int size=1000;   //this is one limitation that the size is fixed
     int arr[]= new int[size];
     int top = -1;

     public void push(int n)
     {
         if(top==size-1)
         {
             System.out.println("you can not add more elements because the size of array is full");
             return;
         }
         top++;
         arr[top]=n;
     }

     public void pop()
     {
         if(top==-1)
         {
             System.out.println("Cannot pop because the stack is already empty");
             return;
         }
         //do not need to delete the element from array because we can just override the element for adding the element in future even we are going backward while popping
         top--;
     }

     public int getSize()
     {
         return top+1;
     }

     public int getTop()
     {
         if(top==-1)
         {
             System.out.println("Stack is empty");
             return -1;
         }
         return arr[top];
     }

     public void printStack()
     {
         if(top==-1)
         {
             System.out.println("Stack is empty");
             return;
         }

         for(int i=0;i<top+1;i++)     //only upto the top (means only the stack elements which are pushed in array)
         {
             System.out.print(arr[i]+ " ");
         }
     }
 }
public class Q1_ImplementStackUsingArrays
{
    public static void main(String[] args) {
        stack stack= new stack();
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.printStack();
        stack.pop();
        System.out.println("Printing stack after popping one element");
        stack.printStack();
        System.out.println("Size of elements in stack "+ stack.getSize());
        System.out.println("Top element in stack "+ stack.getTop());
        stack.pop();
        stack.pop();
        System.out.println("Printing the stack after popping all the elements in stack");
        stack.printStack();
    }
}
