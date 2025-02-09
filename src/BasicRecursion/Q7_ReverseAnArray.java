package BasicRecursion;

public class Q7_ReverseAnArray
{
    public static int[] reverseAnArray(int arr[],int l,int r)
    {
        if(l>=r)
        {
            return arr;
        }
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        return reverseAnArray(arr,l+1,r-1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int l=0;
        int r=arr.length-1;
        reverseAnArray(arr,l,r);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
