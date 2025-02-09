
//Time Complexity: O(N) + O(N), where N = size of the array. First O(N) for counting the number of 0’s, 1’s, 2’s, and second O(N) for placing them correctly in the original array.
//
//Space Complexity: O(1) as we are not using any extra space.

package Arrays.Medium.Q16_Sort_0_1_2;

public class Q16_Sort_0_1_2_Better
{
    public static void sortArray(int arr[])
    {
        int countZero=0, countOne=0,countTwo=0;
           for(int i=0;i<arr.length;i++)
           {
               if(arr[i]==0)
               {
                   countZero++;
               }
               else if(arr[i]==1)
               {
                   countOne++;
               }
               else
               {
                   countTwo++;
               }
           }

           for(int i=0;i<countZero;i++)
           {
               arr[i]=0;
           }
           for(int i=countZero;i<countOne+countZero;i++)
           {
               arr[i]=1;
           }
           for(int i=countOne+countZero;i<arr.length;i++)
           {
               arr[i]=2;
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
