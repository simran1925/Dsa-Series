package BinarySearch.Q15_FindNthRoot;

public class Q15_FindNthRoot_Optimal
{
    public static int findNthSqrt(int n,int nth)
    {
        int s=1;
        int e= n;

        //version 1 if exact nth root does not occur then the lesser should be returned
        while(s<=e)
        {
            int mid= (s+e)/2;
            long sqrt= (long)Math.pow(mid,nth);
            if(sqrt<=n)
            {
                s=mid+1;
            }
            else {
                e=mid-1;
            }
        }
        return e;

        //version 2nd if we want only the exact nth root
//        while(s<=e)
//        {
//            int mid= (s+e)/2;
//            long sqrt= (long)Math.pow(mid,nth);
//            if(sqrt==n)
//            {
//                return mid;
//            }
//            if(sqrt<n)
//            {
//                s=mid+1;
//            }
//            else {
//                e=mid-1;
//            }
//        }
//        return -1;
    }

    public static void main(String[] args) {
        int n = 25;
        int nth=3;
        int ans= findNthSqrt(n,nth);
        System.out.println(ans);
    }
}
