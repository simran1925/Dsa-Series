package BasicMath.Q1_CountDigits;

public class Q1_CountDigits_Optimal
{
    public static void main(String[] args) {
        int n=12345;
        int count=(int) Math.log10(n)+1; // it is a formula which is used to find count of digits
        System.out.println(count);
    }
}
