package BasicRecursion;

public class ReplaceAllOccurencesOfAwithX
{
    public static String replace(String s)
    {
         return allOccurAWithX(s,0);
    }
    public static String allOccurAWithX(String s,int index )
    {
        if(s.length()==index)
        {
            return "";
        }
        char ch= s.charAt(index);

        if(ch=='a')
        {
            return 'x' +allOccurAWithX(s,index+1);
        }
        return ch+ allOccurAWithX(s,index+1);

    }
    public static void
    main(String[] args) {
        String  s= "Simran";
        String ans= replace(s);
        System.out.println(ans);

    }
}
