package Logic_Building_Question.Arrays;

public class RotateAnArrayToLeft
{
    public static int[] rotateArrayToLeft(int[] arr)
    {
        if(arr.length==0)
        {
            return arr;
        }
        int pos=arr[0];
        for(int i=0;i<arr.length-1;i++)
        {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=pos;
        return arr;
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5};
        int ans[]= rotateArrayToLeft(arr);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(arr[i]+ " ");

        }
    }
}
