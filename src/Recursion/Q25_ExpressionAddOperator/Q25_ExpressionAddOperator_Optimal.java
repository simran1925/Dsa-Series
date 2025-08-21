package Recursion.Q25_ExpressionAddOperator;

import java.util.ArrayList;
import java.util.List;

public class Q25_ExpressionAddOperator_Optimal
{
    public static List<String> addOperators(String num, int target) {
        return  getAddOperators(num,target,"",0,0,0,new ArrayList<>());
    }
    public static List<String> getAddOperators(String num, int target,String current, long calculated,long previous,int index,List<String> result)
    {
        if(index==num.length())
        {
            if(calculated==target)
            {
                result.add(current);

            }
            return result;

        }


        for(int i=index;i<num.length();i++)
        {
            if(i!=index && num.charAt(index)== '0')
            {
                break;
            }
            String currentString= num.substring(index,i+1);
            long currentNum = Long.parseLong(currentString);
            if(index==0)
            {
                getAddOperators(num,target,current+currentString,currentNum,currentNum,i+1,result );
            }
            else
            {
                getAddOperators(num,target,current+"+"+currentString,calculated +currentNum,currentNum,i+1,result );

                getAddOperators(num,target,current+"-"+currentString,calculated -currentNum,-currentNum,i+1,result );
                getAddOperators(num,target,current+"*"+currentString,calculated-previous +previous*currentNum,previous*currentNum,i+1,result );
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String num= "098";
        int target = 17;
        List<String> ans = addOperators(num,target);
        System.out.println(ans);

    }
}
