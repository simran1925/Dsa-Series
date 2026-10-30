package BasicRecursion;

public class RemoveSpaceFromString
{
    public static String returnString(String s)
    {
        char[] ans= removeSpace(s.toCharArray(), s.length()-1);
        return new String(ans).trim();
    }
    public static char[] removeSpace(char[] s, int index)
    {
        if(index==1 && s[index]==0)
        {
            return s;
        }
        if(index==0)
        {
            return s;
        }
        if(s[index]==' ')
        {
            char temp= s[index];
            s[index]= s[index-1];
            s[index-1]= temp;
        }
        return removeSpace(s,index-1);
    }
    public static void main(String[] args) {
        String s = "Simranjit Kaur";
        String ans= returnString(s);
        System.out.println(ans);
    }
}
