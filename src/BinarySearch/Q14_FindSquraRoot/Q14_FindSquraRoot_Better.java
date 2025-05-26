package BinarySearch.Q14_FindSquraRoot;

public class Q14_FindSquraRoot_Better
{
    public static int findSqrt(int n)
    {
        int sqrt= (int)Math.sqrt((double) n);
      return sqrt;
    }
    public static void main(String[] args) {
        int n = 28;
        int ans= findSqrt(n);
        System.out.println(ans);
    }
}
