package Arrays;

import java.lang.reflect.Field;
import java.util.*;


public class Revision
{
    public static int ageFun(int nums[],int target) {
        int start = 0;
        int end = nums.length - 1;
        int ans = Integer.MAX_VALUE;
        while (start <= end) {
            int mid = start + (end - start) / 2;

           if(nums[start]<=nums[mid])
           {

           }
        }
        return -1;
    }
//        public static int ageFun1(int nums[],int target)
//        {
//            int start = 0;
//            int end = nums.length - 1;
//            int floor = -1;
//            int ceil = -1;
//            while (start <= end) {
//                int mid = start + (end - start) / 2;
//                if(nums[mid]==target)
//                {
//                    ceil = mid;
//                    start = mid+1;
//                }
//                 else if (nums[mid] >target) {
//                    end = mid - 1;
//                } else {
//                    start = mid + 1;
//                }
//            }
//            System.out.println(ceil);
//            return ceil;
//        }





//        int ans=-1;
//        for(int i=0;i<nums.length;i++)
//        {
//            if(nums[i]==target)
//            {
//                ans= i;
//            }
//            if(nums[i]>target)
//            {
//                if(ans==-1)
//                {
//                    ans= i;
//                }
//                break;
//            }
//        }
//        return ans;

    public static void main(String[] args) {
        int arr[] = {6,5,5,4,0,1,2};
        int ans = Revision.ageFun(arr, 4);
//        int ceil = Revision.ageFun1(arr, 4);
        System.out.println(ans);
//        System.out.println(ceil);
//        System.out.println(ans);
//        for (int i = 0; i < ans.length; i++)
//        {
//            System.out.print(arr[i]+ " ");
//        }
    }
}

