package Arrays.Easy.Q7_MoveZeroesToEnd;

public class Q7_MoveZeroesToEnd_Optimal
{
    public static int[] moveZeroesToEnd(int arr[])
    {
        int j=-1;
       for(int i=0;i<arr.length;i++)
       {
           if(arr[i]==0)
           {
               j=i;
               break;
           }
       }
       if(j==-1)
       {
           return arr;
       }

       for(int i=j+1;i<arr.length;i++)
       {
           if(arr[i]!=0)
           {
               int temp= arr[i];
               arr[i]= arr[j];
               arr[j]=temp;
               j++;
           }
       }
       return arr;
    }
    public static void main(String[] args) {
        int arr[]= {2,3,1,0,5,0,1};
        moveZeroesToEnd(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
