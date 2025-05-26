package BinarySearch.Q15_FindNthRoot;

public class Q15_FindNthRoot_Bruteforce
{
    public static int findNthSqrt(int n,int nth)
    {
        int ans = -1;
        for(int i=1;i<=n;i++)
        {
            long sqrt= (long)Math.pow((double) i,(double) nth);
            System.out.println(sqrt);

            //here two versions
            //if we want exact ans then
//            if(sqrt==n)
//            {
//                ans= i;
//            }
//            else if(sqrt>n){
//                break;
//            }


            //2nd version
            //if exact does not found then return the lower nth root
            if(sqrt<=n)
            {
                ans= i;
            }
            else if(sqrt>n){
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 26;
        int nth=3;
        int ans= findNthSqrt(n,nth);
        System.out.println(ans);
    }
}
