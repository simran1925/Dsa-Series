//T.C. = O(N)
//S.c.= O(1) because no extra space is used
package Arrays.Easy.Q5_LeftRotateArrayByOne;

public class Q5_LeftRotateArrayByOne_Optimal
{
    public static void rotateArray(int arr[])
    {
        int element= arr[0];
        for(int i=0;i<arr.length-1;i++)
        {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=element;
    }
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5};
        rotateArray(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
