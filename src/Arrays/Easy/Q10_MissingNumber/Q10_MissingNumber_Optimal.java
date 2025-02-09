package Arrays.Easy.Q10_MissingNumber;

public class Q10_MissingNumber_Optimal {
    //First solution :- when the n is from 1 to n
    public static int findMissingNO(int arr[],int n)
    {
        int xor1=0, xor2=0;
        for(int i=0;i<arr.length-1;i++)     //don't forget to iterate loop less than one
        {
            xor1= xor1^arr[i];
            xor2= xor2^(i+1);
        }
        xor2= xor2^arr.length;
        return xor1^xor2;
    }
    public static void main(String[] args) {
        int arr[]= {1,3};
        int n=arr.length+1;
        int ans= findMissingNO(arr,n);
        if(ans==-1)
        {
            System.out.println("No any no. is missing");
        }
        else {
            System.out.println(ans);
        }

    }
}

//Solution 2nd:- when the n is from 0 to n
//Given an array nums containing n distinct numbersin the range [0, n],
//return the only number in the range that is missing from the array.

//class Solution {
//    public int missingNumber(int[] nums)
//    {
//        int xor1=0,xor2=0;
//        for(int i=0;i<nums.length;i++)
//        {
//            xor1=xor1^nums[i];
//            xor2=xor2^i;
//        }
//        xor2=xor2^nums.length;
//        return xor1^xor2;
//    }
//}
