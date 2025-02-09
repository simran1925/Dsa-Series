//T.C. = O(n^2)
//S.C. = O(1)
package Arrays.Easy.Q3_IsSorted;

public class Q3_IsSorted_Bruteforce
{
    public static boolean isSorted(int arr[])
    {
        boolean flag=true;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[i])
                {
                    flag=false;
                }
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        if(isSorted(arr))
        {
            System.out.println("Sorted");
        }
        else {
            System.out.println("Not sorted");
        }
    }
}
