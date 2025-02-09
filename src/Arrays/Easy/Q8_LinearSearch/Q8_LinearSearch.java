package Arrays.Easy.Q8_LinearSearch;

public class Q8_LinearSearch
{
    public static int linearSearch(int arr[],int k)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==k)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,2,9};
        int ans=linearSearch(arr,10);
        if(ans==-1)
        {
            System.out.println("Element is not present ");
        }
        else
        {
            System.out.println("Element is present at "+ ans +" position");
        }
    }
}
