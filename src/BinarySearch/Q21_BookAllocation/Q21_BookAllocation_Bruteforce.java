package BinarySearch.Q21_BookAllocation;

public class Q21_BookAllocation_Bruteforce
{
    public static int countStudents(int arr[], int page)
    {
        int students=1;
        int preBook= 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]+ preBook<=page)
            {
                preBook+=arr[i];
            }
            else {
                students++;
                preBook= arr[i];
            }
        }
        return students;
    }
    public static int findBookAllocation(int pages[], int students)
    {
        int min = Integer.MIN_VALUE;     //(actually we are finding the max value which will be our minimum)
        int max= 0;
        for(int i=0;i<pages.length;i++)
        {
            min= Math.max(min,pages[i]);
            max+=pages[i];
        }

        for(int i=min;i<=max;i++)
        {
            if(countStudents(pages,i)==students)
            {
                return i;
            }
        }
        return min;
    }

    public static void main(String[] args) {
       int arr[]= {25, 46, 28, 49, 24};
       int ans = findBookAllocation(arr,4);
        System.out.println(ans);
    }
}
