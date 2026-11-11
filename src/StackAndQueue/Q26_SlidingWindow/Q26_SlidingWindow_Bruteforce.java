package StackAndQueue.Q26_SlidingWindow;

public class Q26_SlidingWindow_Bruteforce
{
    public static int[] maxSlidingWindow(int[] nums, int k) {

        int n= nums.length;
        int ans[]= new int[n-k+1];

        for(int i=0;i<n-k+1;i++)
        {
            int maxi= nums[i];
            for(int j=i;j<i+k;j++)
            {
                maxi= Math.max(maxi,nums[j]);
                ans[i]= maxi;
            }
        }
        return ans;


    }
    public static void main(String args[]) {
        int i, j, n, k = 3, x;
        int arr[]={4,0,-1,3,5,3,6,8};
        int ans[] = maxSlidingWindow(arr, k);
        System.out.println("Maximum element in every " + k + " window ");
        for (i = 0; i < ans.length; i++)
            System.out.print(ans[i] + "  ");

    }
}
