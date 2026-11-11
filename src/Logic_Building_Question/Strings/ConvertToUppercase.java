package Logic_Building_Question.Strings;

public class ConvertToUppercase
{
    public static String convertToUpperCase(String s)
    {
        String newString = "";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            char newCh= (char) (ch-32);
            newString+=newCh;
        }
        return newString;
    }
    public static void main(String[] args) {
          String s = new String("simran");
          String ans = convertToUpperCase(s);
        System.out.println(ans);

    }
}
