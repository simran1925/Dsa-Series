package Arrays.Hard.Q37_FindRepeatingAndMissingElement;

public class Q37_FindRepeatingAndMissingElement_Bruteforce
{
    public static int[] findRepeatingAndMissingElement(int arr[])
    {
        int repeating=-1,missing=-1;
        for(int i=1;i<=arr.length;i++)
        {
            int count=0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j]==i)
                {
                    count++;
                }
            }
            if(count==2)
            {
                repeating=i;
            }
            if(count==0)
            {
                missing=i;
            }
            if(repeating!=-1 && missing!=-1)
            {
                break;
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
