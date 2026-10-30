package StackAndQueue.Q19_TrappingRainWater;
//Bruteforce using dual looop

// main concept in this question :
//just make diagram u will see that if u want to measure the water trap for
//the current height then it will be go towards left until the reaches the most largest element to left
//Similarly to right until the most largest element in right is not found
//ie. largest of left and largest of right

//among largest of left and largest of right now we need the smallest of them

//so Math.min(leftMax, rightMax)
//then the ans will be summation of all these minimums


//THe different in approaches is only the way of finding the left largest and the right largest
//remaining the calculation will be same
public class Q19_TrappingRainWater_Bruteforce
{
    public static int trap(int[] height) {
        int sum=0;
        for(int i=0;i<height.length;i++)
        {
            int left=0,  right=0;
            int j=i;
            while(j>=0)
            {
                left= Math.max(left,height[j]);
                j--;
            }

            j=i;
            while(j<height.length)
            {
                right=Math.max(right,height[j]);
                j++;
            }


            sum+= Math.min(left,right)-height[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[]= {4,2,0,3,2,5};
        int ans = trap(arr);
        System.out.println(ans);
    }
}
