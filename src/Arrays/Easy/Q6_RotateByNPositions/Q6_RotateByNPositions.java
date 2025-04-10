package Arrays.Easy.Q6_RotateByNPositions;

public class Q6_RotateByNPositions
{
    public static void rotateArrayByN(int arr[],int k,String direction)
    {
        //for left rotate optimal
//        if(nums.length==0)
//        {
//            return;
//        }
//        target=target%nums.length;
//        if(target>nums.length)
//        {
//            return;
//        }
//        int temp[] = new int[target];
//        for(int i=0;i<target;i++)
//        {
//            temp[i]=nums[i];
//        }
//
//        for( int i=target;i<nums.length;i++)
//        {
//            nums[i-target]=nums[i];
//        }
//        int i=0;
//        for(int j=nums.length-target;j<nums.length;j++)
//        {
//            nums[j]= temp[i];
//            i++;
//        }

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
//        Submitted ans for right shift
//        public void rotate(int[] nums, int k) {
//        int temp[] = new int[k];
//        int tempIndex=0;
//        if(nums.length==0)
//        {
//            return;
//        }
//        k= k%nums.length;
//        if(k>nums.length)
//        {
//            return;
//        }
//        for(int i=nums.length-k;i<nums.length;i++)
//        {
//            temp[tempIndex]=nums[i];
//            tempIndex++;
//        }
//
//        for( int i=(nums.length-k)-1;i>=0;i--)
//        {
//            nums[i+k]=nums[i];
//        }
//        int i=0;
//        for(int j=0;j<k;j++)
//        {
//            nums[j]= temp[i];
//            i++;
//        }
//    }
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
