package BinarySearch.Q14_FindSquraRoot;

public class Q14_FindSquraRoot_Bruteforce
{
    public static int findSqrt(int n)
    {
        int ans = 0;
        for(int i=1;i<=n;i++)
        {
            long sqrt= i*i;
            if(sqrt<=n)
            {
                ans= i;
            }
            else {
                break;

            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 28;
        int ans= findSqrt(n);
        System.out.println(ans);
    }
}
