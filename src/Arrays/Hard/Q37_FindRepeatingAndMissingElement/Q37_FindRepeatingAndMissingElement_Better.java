package Arrays.Hard.Q37_FindRepeatingAndMissingElement;

public class Q37_FindRepeatingAndMissingElement_Better
{
    public static int[] findRepeatingAndMissingElement(int arr[])
    {
        int repeating=-1,missing=-1;
        int hash[]= new int[arr.length+1];
        for(int i=0;i<arr.length;i++)
        {
            hash[arr[i]]++;
        }
        for(int i=1;i<hash.length;i++)
        {
            if(hash[i]==0)
            {
                missing=i;
            }
            else if(hash[i]==2)
            {
                repeating=i;
            }
        }
        return new int[]{missing,repeating};
    }

    public static void main(String[] args) {
        int arr[]= {1,2,3,6,7,5,4,4};
        int[]ans= findRepeatingAndMissingElement(arr);
        System.out.print("missing element is : "+ ans[0]);
        System.out.println();
        System.out.print("repeating element is : "+ ans[1]);
    }
}
