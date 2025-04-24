package Arrays.Medium.Q28_SubarraySumCount;

import java.util.HashMap;
import java.util.Map;

public class Q28_SubarraySumCount_Optimal
{
    public static int findAllSubarraysWithGivenSum(int arr[], int k) {
        int count=0;int sum=0;
        Map<Integer,Integer> map= new HashMap<>();
        map.put(0,1);
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            int rem= sum-k;
            count+=map.getOrDefault(rem,0);

            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3};
//        int arr[]= {3, 1, 2, 4};
//        int ans= findAllSubarraysWithGivenSum(arr,6);
        int ans= findAllSubarraysWithGivenSum(arr,3);
        System.out.println(ans);
    }
}






