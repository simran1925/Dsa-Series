//package Arrays.Medium.Q24_LongestConsecutiveSequence;
//
//import javax.print.DocFlavor;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Map;
//
//public class Q24_LongestConsecutiveSequence_Better
//{
//    public static List<Integer> longestConsecutiveSequence(int arr[])
//    {
//        List<Integer>ans = new ArrayList<>();
//        Arrays.sort(arr);
//        int noOfDigitsInSequence=1;
//        int max=0;
//        for(int i=0;i<arr.length-1;i++)
//        {
//            if(arr[i]==arr[i+1]-1)
//            {
//                noOfDigitsInSequence++;
//            }
//            if(arr[i]!=arr[i+1]-1)
//            {
//                if(noOfDigitsInSequence>max)
//                {
//                    if(!ans.isEmpty())
//                    {
//                        ans.clear();
//                    }
//                }
//            }
//        }
//    }
//    public static void main(String[] args) {
//
//    }
//}
