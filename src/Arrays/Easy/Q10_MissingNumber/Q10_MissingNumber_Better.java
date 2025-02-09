package Arrays.Easy.Q10_MissingNumber;

public class Q10_MissingNumber_Better
{
    public static int findMissingNO(int arr[],int n)
    {
        int count=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=arr[i+1]-1) {
                return arr[i] + 1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]= {1,3};
        int n=arr.length+1;
       int ans= findMissingNO(arr,n);
       if(ans==-1)
       {
           System.out.println("No any no. is missing");
       }
       else {
           System.out.println(ans);
       }

    }
}
