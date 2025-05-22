package BinarySearch.Q11_FindHowManyTimesArrayRotated;

public class Q11_FindHowManyTimesArrayRotated_Optimal
{
   public static int findRotatedTimes(int nums[])
   {
       int s= 0;
       int e= nums.length-1;
       int ans = Integer.MAX_VALUE;
       int index =0;
       while(s<=e)
       {
           int mid= (s+e)/2;
           if(nums[s]<=nums[e])
           {
               if(nums[s]<ans)
               {
                   index=s;
                   ans = nums[s];
                   break;
               }
           }
           if(nums[s]<=nums[mid])
           {
               if(nums[s]<ans)
               {
                   index= s;
                   ans = nums[s];
               }
               s=mid+1;
           }
           else {
               if(nums[mid]<ans)
               {
                   index=e;
                   ans = nums[mid];
               }
               e= mid-1;
           }
       }
       return index;
   }
    public static void main(String[] args) {
        int arr[]= {3,4,5,1,2};
        int ans = findRotatedTimes(arr);
        System.out.println(ans);
    }


    //To find max
//   public static int findRotatedTimes(int nums[])
//   {
//       int s= 0;
//       int e= nums.length-1;
//       int ans = Integer.MIN_VALUE;
//       int index =0;
//       while(s<=e)
//       {
//           int mid= (s+e)/2;
//           if(nums[s]<=nums[e])
//           {
//               if(nums[e]>ans)
//               {
//                   index=e;
//                   ans = nums[e];
//                   break;
//               }
////               ans = Math.max(ans,nums[e]);
////               index=e;
////               break;
//           }
//           if(nums[s]<=nums[mid])
//           {
//               if(nums[mid]>ans)
//               {
//                   index=  mid;
//                   ans = nums[mid];
//               }
//               s=mid+1;
//           }
//           else {
//               if(nums[e]>ans)
//               {
//                   index=e;
//                   ans = nums[e];
//               }
//               e= mid-1;
//           }
//       }
//       return index;
//   }
//    public static void main(String[] args) {
//        int arr[]= {3,4,5,1,2};
//        int ans = findRotatedTimes(arr);
//        System.out.println(ans);
//    }
}
