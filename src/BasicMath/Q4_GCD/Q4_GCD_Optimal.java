//Desi approach - when we divide two no. with themselves their remainder is their HCF but we need to find the greater and smaller so that which will be the divider and which will be the dividend
package BasicMath.Q4_GCD;

public class Q4_GCD_Optimal
{
    public static void main(String[] args) {
        int n1=12, n2=9;
//        int gcd=1;
        while(n1>0 && n2>0)
        {
            if(n1>n2)
            {
                n1=n1%n2;
            }
            else if(n2>=n1)
            {
                n2=n2%n1;
            }
        }
        if(n1==0)
        {
            System.out.println(n2); //then it will be the gcd
        }

        else {
            System.out.println(n1);
        }
    }
}
