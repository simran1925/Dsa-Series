package Logic_Building_Question.MathAndNumberLogic;


//Lcm suppose 4 and 6
//4*1=4          6*1=6
//4*2=8          6*2=12
//4*3=12         6*3=18
//here 12 is the least common factor but we do not need to find like this
//we will use simple formula means if multiple of one number is divisible for other then it is lcm
//e.g. For a = 4 and b = 6:
//- 4 * 1 = 4 → not divisible by 6.
//- 4 * 2 = 8 → not divisible by 6.
//- 4 * 3 = 12 → divisible by 6!
public class LeastCommonFactor
{
    public  static int findLCM(int a, int b)
    {
        int lcm=0;
        int i=1;
        while(lcm==0)
        {
            if((i*a)%b==0)
            {
                lcm=i*a;
                return lcm;
            }
            i++;
        }
        return lcm;
    }
    public static void main(String[] args) {

        int a=4, b= 6;
        int ans= findLCM(a,b);
        System.out.println(ans);
    }
}
