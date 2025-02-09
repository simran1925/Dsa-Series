package BasicRecursion;

public class Q1_PrintName
{
    static int count=1;
    public static void printName()
    {
//        if(count<=3) //1st way
//        {
//            System.out.println("Simran");
//            count++;
//            printName();
//
//        }
        if(count>3) //2nd way
        {
            return;
        }
        System.out.println("Simmu");
        count++;
        printName();
    }
    public static void main(String[] args) {
printName();
    }
}
