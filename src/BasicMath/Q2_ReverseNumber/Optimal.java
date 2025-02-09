package BasicMath.Q2_ReverseNumber;

public class Optimal
{
        public static int reverse(int x) {
            boolean isNegative=false;   // to handle the negatives
            if (x<0)
            {
                isNegative=true;
                x= x*(-1);
            }
            long rev =0;
            while(x>0)
            {
                int ld= x%10;
                rev= (rev* 10 )+ ld;
                x= x/10;
            }
            if(isNegative==true)
            {
                rev= rev* (-1);
            }
// for handling max and min range  because int have its own limited range
            if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE)
            {
                return 0;
            }
            return (int)rev;
        }

    public static void main(String[] args) {
        System.out.println(reverse(1234));
    }
}
