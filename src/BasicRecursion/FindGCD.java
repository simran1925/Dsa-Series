package BasicRecursion;

public class FindGCD {
    public static int printGCD(int a, int b)
    {
        int index=Math.min(a,b);
        return findGCD(a, b, index);
    }
    public static int findGCD(int a, int b, int index)
    {
        if(a%index==0 && b%index==0)
        {
            return index;
        }
        return findGCD(a,b,index-1);
    }
    public static void main(String[] args) {

        int a=12, b=16;
        int ans = printGCD(a,b);
        System.out.println(ans);
    }
}
