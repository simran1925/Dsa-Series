package Arrays.Easy.Q7_MoveZeroesToEnd;

public class Q7_MoveZeroesToEnd_Bruteforce
{
    public static void moveZeroesToEnd(int arr[])
    {
        int[] temp= new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                temp[j]=arr[i];
                j++;
            }
        }
        for(int i=0;i<temp.length;i++)
        {
            System.out.print(temp[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]= {2,3,1,0,5,0,3,0};
        moveZeroesToEnd(arr);

    }
}
