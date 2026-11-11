package Logic_Building_Question.Strings;

import java.util.HashSet;

public class FindFrequencyOfCharacters
{
    public static void findFrequency(String s)
    {
        int temp[]= new int[128];
        for(int i=0;i<s.length();i++)
        {
            temp[s.charAt(i)]++;
        }

        boolean visited[]= new boolean[128];
        for (int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if (!visited[ch]) {
                System.out.print(ch + " appears "+ temp[ch] + ",");
                visited[ch]= true;
            }
        }

    }
    public static void main(String[] args) {
     findFrequency("SSimran");
    }
}
