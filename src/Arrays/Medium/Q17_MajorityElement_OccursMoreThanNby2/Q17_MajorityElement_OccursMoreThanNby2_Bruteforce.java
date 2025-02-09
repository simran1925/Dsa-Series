package Arrays.Medium.Q17_MajorityElement_OccursMoreThanNby2;

import java.util.Arrays;
import java.util.Map;

public class Q17_MajorityElement_OccursMoreThanNby2_Bruteforce
{
    public static int findMajorityElement(int arr[])
    {
       for(int i=0;i<arr.length;i++)
        {
            int count=0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count>(arr.length/2))
            {
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]= {2,2,1,1,1,2,2,3,3,3,3,3,3,3,3,3};
        int ans= findMajorityElement(arr);
        System.out.println(ans);
    }
}
