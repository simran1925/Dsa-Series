//here the space complexity is O(N) because extra array is used
//here the time complexity is O(N*N)

package Arrays.Medium.Q26_Rotate_matrix_by_90_degrees;

public class Q26_Rotate_matrix_by_90_degrees_bruteforce
{
    public static int[][] rotateArray(int[][] nums)
    {
        int n= nums.length;
        int rotate[][]= new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                rotate[j][nums.length-i-1]=nums[i][j];
            }
        }
        return rotate;
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
