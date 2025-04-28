package Arrays.Hard.Q39_ReversePairs;

import java.util.ArrayList;
import java.util.List;

public class Q39_ReversePairs_Optimal
{
    public static void merge(int nums[], int low, int mid, int high)
    {
        List<Integer> ans = new ArrayList<>();
        int left= low;
        int right= mid+1;
        while(left<=mid && right<=high)
        {
            if(nums[left]<=nums[right])
            {
                ans.add(nums[left]);
                left++;
            }
            else
            {
                ans.add(nums[right]);
                right++;
            }
        }
        while(left<=mid)
        {
            ans.add(nums[left]);
            left++;
        }
        while(right<=high)
        {
            ans.add(nums[right]);
            right++;
        }

        for(int i=low;i<=high;i++)
        {
            nums[i]= ans.get(i-low);
        }
    }

    public static int countPairs(int arr[], int low, int mid, int high)
    {
        int count=0;
        int right= mid+1;
        for(int i=low;i<=mid;i++)
        {
            while(right<=high && (long)arr[i]> 2* (long)arr[right])    //very necessary to typecast into long
            {
                right++;
            }
            count+=right-(mid+1);
        }
        return count;
    }

    public static int mergeSort(int nums[], int low, int high)
    {
        int count=0;
        if(low>=high)
        {
            return count;
        }
        int mid= (low+high)/2;
        count+=mergeSort(nums,low,mid);   //first half
        count+=mergeSort(nums,mid+1,high);  //second half
        count+=countPairs(nums,low, mid, high);
        merge(nums,low,mid,high);

        return count;
    }
    public static int reversePairs(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
    }
    public static void main(String[] args) {
        int arr[]= {4, 1, 2, 3, 1};
        int ans =reversePairs(arr);
        System.out.println(ans);
    }
}
