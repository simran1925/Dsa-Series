//Time complexity = O(N) + O(N) = O(N)
//space complexity= O(1)
package Arrays.Medium.Q21_RearrangePositiveNegatives;

public class Q21_RearrangePositiveNegatives_Better
{
    public static void rearrange(int arr[])
    {
        int n=0,p=1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0)
            {
                n=i;
                break;
            }
        }
        for(int i=n;i<arr.length-1;i++)
        {
            if(arr[i]<0)
            {
                int temp = arr[p];
                arr[p]=arr[i];
                arr[i]= temp;
                p=p+2;
            }
        }
    }
    public static void main(String[] args)
    {
//        int arr[]= {1,2,3,-3,-2,-1};
        int arr[]= {1,2,-3,-1,-2,3};
//        int arr[]= {-1,-2,-3,1,2,3};      not passing this test case
        rearrange(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
