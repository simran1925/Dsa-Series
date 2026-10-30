package BasicRecursion;

public class countVowelsInAString
{
    public static int countVowels(String s)
    {
         return functionToCount(s,s.length()-1,0);
    }
    public static int functionToCount(String s, int n, int count)
    {
        if(n==0)
        {
            return count;
        }
        if(s.charAt(n)=='a' || s.charAt(n)=='e' || s.charAt(n)=='i' || s.charAt(n)=='o' || s.charAt(n)=='u')
        {
            count++;
        }
       return functionToCount(s,n-1,count);
    }
    public static void main(String[] args) {
        String s= "Siimran";
        int ans = countVowels(s);
        System.out.println(ans);
    }
}
