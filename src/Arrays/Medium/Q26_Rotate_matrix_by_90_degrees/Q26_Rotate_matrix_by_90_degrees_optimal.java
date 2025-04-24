//here the space complexity is O(1)
//time complexity is O(N*N) + O(N*N) = O(N*N)

package Arrays.Medium.Q26_Rotate_matrix_by_90_degrees;

public class Q26_Rotate_matrix_by_90_degrees_optimal
{
    public static int[][] rotateArray(int[][] nums)
    {
        //for transpose always remember that the j will be started from i
       for(int i=0;i<nums.length;i++)
       {
           for(int j=i;j<nums[0].length;j++)
           {
               int temp= nums[i][j];
               nums[i][j]=nums[j][i];
               nums[j][i]=temp;
           }
       }

       //for reverse always remember j will start from 0 but upto n/2
       for(int i=0;i<nums.length;i++)
       {
           for(int j=0;j<nums.length/2;j++)
           {
               int temp= nums[i][j];
               nums[i][j]=nums[i][nums.length-1-j];
               nums[i][nums.length-1-j]=temp;
           }
       }
       return nums;
    }

    public static void main(String[] args) {
        int arr[][] =  {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int ans[][]=rotateArray(arr);
        for(int i=0;i<ans.length;i++)
        {
            for(int j=0;j<ans.length;j++)
            {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
