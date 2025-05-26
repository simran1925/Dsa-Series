package BinarySearch.Q14_FindSquraRoot;

public class Q14_FindSquraRoot_Optimal
{
    public static int findSqrt(int n)
    {
       int s=1;
       int e= n;
       while (s<=e)
       {
       int mid= (s+e)/2;
       long sqrt= mid*mid;
         if(sqrt<=n)
         {
             s=mid+1;
         }
         else {
           e=mid-1;
       }
       }
       return e;
    }
    public static void main(String[] args) {
        int n = 37;
        int ans= findSqrt(n);
        System.out.println(ans);
    }
}
