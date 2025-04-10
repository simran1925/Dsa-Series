package Arrays.Medium.Q24_LongestConsecutiveSequence;

public class Q24_LongestConsecutiveSequence_Bruteforce {
    public static boolean linearSearch(int []a, int num) {
        int n = a.length; //size of array
        for (int i = 0; i < n; i++) {
            if (a[i] == num)
                return true;
        }
        return false;
    }
    public static int findLongestConsecutiveSequence(int nums[]) {
        if (nums.length == 0) {
            return 0;
        }
        int maxConsecutiveSequence = 1;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int x= nums[i];
            count=1;
            while (linearSearch(nums, x + 1))
            {
                x=x+1;
                count=count+1;
            }
            maxConsecutiveSequence = Math.max(maxConsecutiveSequence, count);
        }
        return maxConsecutiveSequence;
    }

    public static void main(String[] args) {
        int arr[]= {3, 8, 5, 7, 6};
//        3 5 6 7 8
        int ans=findLongestConsecutiveSequence(arr);
        System.out.println(ans);

    }
}
