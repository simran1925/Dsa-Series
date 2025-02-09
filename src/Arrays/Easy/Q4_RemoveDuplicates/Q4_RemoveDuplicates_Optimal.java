//T.C. = O(N)
//S.C.= O(1)
package Arrays.Easy.Q4_RemoveDuplicates;

public class Q4_RemoveDuplicates_Optimal
{
    //This sol. will work only if we have sorted array
    public static int removeDuplicates(int arr[])
    {
        int i=0;
        for(int j=1;j<arr.length;j++)
        {
            if(arr[i]!=arr[j])
            {
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int arr[]={1,1,4,4,5,7,2,6,6};     //Array is given in sorted order otherwise we need to sort first
       int k= removeDuplicates(arr);
        for(int i=0;i<k;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
