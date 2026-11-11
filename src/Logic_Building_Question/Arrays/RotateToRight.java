package Logic_Building_Question.Arrays;

public class RotateToRight
{
    public static int[] rotateArrayToRight(int arr[])
    {
        if(arr.length==0)
        {
            return arr;
        }
        int pos = arr[arr.length-1];
        System.out.println(pos);
        for(int i=arr.length-1;i>0;i--)
        {
            arr[i]= arr[i-1];
        }
        arr[0]= pos;
        return arr;
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5};
        int ans[]= rotateArrayToRight(arr);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" " );
        }

    }
}
