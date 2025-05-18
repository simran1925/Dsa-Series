package Strings.Q4_FindLongestPrefix;

public class Q4_FindLongestPrefix_Bruteforce
{
    public static String findLongestPrefix(String[] arr)
    {
        if (arr == null || arr.length == 0) return "";
        String str = arr[0];
        StringBuilder stringBuilder = new StringBuilder();
        boolean isPre= true;
        for(int i=0;i<str.length();i++)      //for the charcters
        {
            char ch= str.charAt(i);
            for(int j=1;j<arr.length;j++)      //for arrays
            {
                String string = arr[j];
                if (string.length()<=str.length())
                {
                    char ch2= string.charAt(i);
                    if(ch!=ch2)
                    {
                        isPre=false;
                        break;
                    }
                }

            }
          if(isPre==true)
          {
              stringBuilder.append(ch);
          }
          else {
              break;
          }
        }
        return stringBuilder.toString();
    }
    public static void main(String[] args) {
        String arr[]= {"flower","flow","flight"};
        String ans= findLongestPrefix(arr);
        System.out.println(ans);
    }
}
