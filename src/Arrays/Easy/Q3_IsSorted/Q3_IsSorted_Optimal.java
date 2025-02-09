//T.C. = O(n)
//S.C. = O(1)
package Arrays.Easy.Q3_IsSorted;

public class Q3_IsSorted_Optimal
{
    public static boolean isSorted(int arr[])
    {
        boolean flag=true;
        for(int i=0;i<arr.length-1;i++) {
            if (arr[i] > arr[i + 1]){
                flag=false;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        int arr[]={1,2,4};
        if(isSorted(arr))
        {
            System.out.println("Sorted");
        }
        else {
            System.out.println("Not sorted");
        }
    }
}
