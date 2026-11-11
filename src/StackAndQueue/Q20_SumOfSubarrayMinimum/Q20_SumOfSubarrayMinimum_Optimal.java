package StackAndQueue.Q20_SumOfSubarrayMinimum;

import java.util.Stack;

public class Q20_SumOfSubarrayMinimum_Optimal {
    public static int sumSubarrayMins(int[] arr) {
        long mod= 1_000_000_007;
        long sum=0;    //1. also take the long
        //find the NSL ans NSR arrays
        int nsl[]= new int[arr.length];
        int nsr[]= new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            while (!stack.isEmpty() && arr[stack.peek()]>arr[i])    //3. here when we are comparing then we should compare wieth arr[stack.peek()] becasue we are puttijng the index instead of actual element
            {
                stack.pop();
            }
            nsl[i]= stack.isEmpty()?-1: stack.peek();
            stack.push(i);   //2. always keep in mind here we are putting the indexes not the acuatl number
        }
        stack.clear();
        for(int i=arr.length-1;i>=0;i--)   //4. here equal to is very must to apply
        {
            while (!stack.isEmpty() && arr[stack.peek()]>=arr[i])
            {
                stack.pop();
            }
            nsr[i]= stack.isEmpty()?arr.length: stack.peek();
            stack.push(i);
        }

        //now find result
        for(int i=0;i<arr.length;i++)
        {
            long left= i- nsl[i];
            long right= nsr[i]-i;
            sum= (sum+ (long)arr[i] * left* right)% mod;     //5. learn it properly
        }
        return (int) sum;
    }
    public static void main(String[] args) {
        int arr[]= {3,1,2,4};
        int ans= sumSubarrayMins(arr);
        System.out.println(ans);
    }
}
