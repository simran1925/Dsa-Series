//This problem is a variation of the popular Dutch National flag algorithm.
//Time Complexity: O(N), where N = size of the given array.
//        Reason: We are using a single loop that can run at most N times.
//
//Space Complexity: O(1) as we are not using any extra space.

package Arrays.Medium.Q16_Sort_0_1_2;

public class Q16_Sort_0_1_2_Optimal
{
    public static void sortArray(int arr[])
    {
       int mid=0,low=0,high=arr.length-1;
       while(mid<=high)
       {
           if(arr[mid]==2)
           {
               int temp= arr[mid];
               arr[mid]=arr[high];
               arr[high]=temp;

               high--;
           }
           else if(arr[mid]==0)
           {
               int temp= arr[mid];
               arr[mid]=arr[low];
               arr[low]=temp;

               low++;
               mid++;
           }
           else if(arr[mid]==1)
           {
               mid++;
           }
       }
    }
    public static void main(String[] args)
    {
        int arr[]= {0,1,2,0,2,2,1,0,1,1,0};
        sortArray(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
