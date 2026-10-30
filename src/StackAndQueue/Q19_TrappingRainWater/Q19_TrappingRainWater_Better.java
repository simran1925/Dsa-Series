package StackAndQueue.Q19_TrappingRainWater;

public class Q19_TrappingRainWater_Better
{
    public static int trap(int[] height) {

       // use the prefix and suffix method
        int pref[]= new int[height.length];
        int suffix[]= new int[height.length];

        //step 1 : firlty we will find the leftMax and the rightMax elements for each element and store them in arrays of pref and suffix
        pref[0]= height[0];
        for(int i=1;i<height.length;i++)
        {
            pref[i]= Math.max(pref[i-1],height[i]);
        }
        suffix[height.length-1]= height[height.length-1];
        for(int i=height.length-2;i>=0;i--)
        {
            suffix[i]= Math.max(suffix[i+1],height[i]);
        }

        //now find the actual result
        int ans = 0;
        for(int i=0;i<height.length;i++)
        {
          //now we will apply the formula
            ans +=Math.min(pref[i],suffix[i]) -height[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]= {4,2,0,3,2,5};
        int ans = trap(arr);
        System.out.println(ans);
    }
}
