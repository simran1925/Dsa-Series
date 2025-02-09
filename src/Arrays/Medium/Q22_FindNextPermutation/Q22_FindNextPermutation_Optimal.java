package Arrays.Medium.Q22_FindNextPermutation;

import java.awt.geom.Line2D;
import java.util.Arrays;

public class Q22_FindNextPermutation_Optimal
{
    public static void nextPermutation(int arr[])
    {
        //step 1
        int index=-1;
        for(int i=arr.length-2;i>=0;i--)
        {
            if(arr[i]<arr[i+1])
            {
                index=i;
                break;
            }
        }

        //Edge case
        if(index==-1)
        {
            reverseArray(0,arr.length-1,arr);
            return;
        }

//        Step 2
        for(int i=arr.length-1;i>=index;i--)
        {
            if(arr[i]>arr[index])
            {
                int temp= arr[i];
                arr[i]= arr[index];
                arr[index]= temp;
                break;
            }
        }

        //step 3
        reverseArray(index+1,arr.length,arr);
    }

    public static void reverseArray(int l,int r,int arr[])
    {
        while(l<r)
        {
            int temp = arr[l];
            arr[l]= arr[r];
            arr[r]= temp;
            l++;
            r--;
        }
    }
    public static void main(String[] args)
    {
//      int arr[]= {2, 1, 5, 4, 3, 0, 0};
        int arr[]= {5,4,3,2,1,0};
      nextPermutation(arr);
      for(int i=0;i<arr.length;i++)
      {
          System.out.print(arr[i]+" ");
      }
    }
}
