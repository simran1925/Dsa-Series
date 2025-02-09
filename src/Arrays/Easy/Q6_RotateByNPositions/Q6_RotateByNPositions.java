package Arrays.Easy.Q6_RotateByNPositions;

public class Q6_RotateByNPositions
{
    public static void rotateArrayByN(int arr[],int k,String direction)
    {
        if(direction.equals("left"))
        {
            int pos[] = new int[k];
            for (int i = 0; i < k; i++) {
                pos[i] = arr[i];
            }
            for(int i=0;i<arr.length-k;i++)
            {
                arr[i]= arr[i+k];
            }
            int posi=0;
            for(int i=arr.length-k;i<arr.length;i++)
            {
                arr[i]=pos[posi];
                posi++;
            }
        }
        else if(direction.equals("right"))
        {
            int[] pos = new int[k];
            int posi=0;
            for(int i=arr.length-1;i>=arr.length-k;i--)
            {
               pos[posi]= arr[i];
               posi++;
            }
            for(int i=arr.length-1;i>=k;i--)
            {
                arr[i]= arr[i-k];
            }
            posi=0;
            for(int i=k-1;i>=0;i--)
            {
                arr[i]=pos[posi];
                posi++;
            }
        }
        }

    public static void main(String[] args)
    {
        int arr[]= {3,7,8,9,10,11};
        rotateArrayByN(arr,3,"left");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
}
