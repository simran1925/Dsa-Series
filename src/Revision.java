import java.util.Arrays;

public class Revision
{
    public static int printName(int[] arr)
    {
        Arrays.sort(arr);
        int max= arr[arr.length-1];
        int secondMax=-1;
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]!=max)
            {
                secondMax=arr[i];
                break;
            }
        }
        return secondMax;
    }
    public static void main(String[] args) {
       int arr[]= {1,6,7,3,10,5};
       int ans=printName(arr);
        System.out.println(ans);
    }

}
