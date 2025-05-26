package BinarySearch.Q21_BookAllocation;

public class Q21_BookAllocation_Optimal
{
    public static int countStudents(int arr[], int page)
    {
       int totalStudents=1;
       int pagesSum=0;
       for(int i=0;i<arr.length;i++)
       {
           if(pagesSum+arr[i]<=page)
           {
               pagesSum+=arr[i];
           }
           else {
               totalStudents++;
               pagesSum= arr[i];
           }
       }
       return totalStudents;
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
     int start=min;
        int end = max;
        while(start<=end)
        {
            int mid = start+ (end-start)/2;
            if(countStudents(pages,mid)>students)
            {
                start= mid+1;
            }
            else {
                end= mid-1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int arr[]= {25, 46, 28, 49, 24};
        int ans = findBookAllocation(arr,4);
        System.out.println(ans);
    }
}
