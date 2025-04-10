package Arrays.Medium.Q27_MatrixSpiral;

import java.util.ArrayList;
import java.util.Arrays;

public class Q27_MatrixSpiral_Approach
{
    public static ArrayList<Integer> matrixSpiral(int arr[][])
    {
        int n= arr.length;
        int m= arr[0].length;
        int top=0,left=0,right=m-1,bottom=n-1;
        ArrayList<Integer> ans = new ArrayList<>();
        while(left<=right && top<=bottom)
        {
            for(int i=left;i<=right;i++)
            {
                ans.add(arr[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++)
            {
                ans.add(arr[i][right]);
            }
            right--;
            if(top<=bottom)
            {
                for(int i=right;i>=left;i--)
                {
                    ans.add(arr[bottom][i]);
                }
                bottom--;
            }

            if(left<=right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(arr[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[][] =  {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        ArrayList<Integer> ans =matrixSpiral(arr);
        System.out.println(ans);
    }
}
