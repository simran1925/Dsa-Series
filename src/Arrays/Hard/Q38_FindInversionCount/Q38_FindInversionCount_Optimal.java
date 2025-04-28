package Arrays.Hard.Q38_FindInversionCount;

import java.util.ArrayList;
import java.util.List;

public class Q38_FindInversionCount_Optimal
{
    public static int merge(int arr[], int low,int mid,int high)
    {
        List<Integer> list= new ArrayList<>();
        int left= low;
        int right= mid+1;

        //modification 1
        int count=0;
        while(left<=mid && right<=high)
        {
            if(arr[left]<=arr[right])
            {
                list.add(arr[left]);
                left++;
            }
            else {  //(if the left element is bigger than right (which is our requirement))
                list.add(arr[right]);
                count+=mid-left+1;
                right++;
            }
        }

        while(left<=mid)
        {
            list.add(arr[left]);
            left++;
        }
        while(right<=high)
        {
            list.add(arr[right]);
            right++;
        }

        //putting temp arrraylist in array (merged elements)
        for(int i=low;i<=high;i++)
        {
            arr[i]= list.get(i-low);
        }
        return count;
    }

    public static int mergeSort(int arr[],int low,int high)
    {
        int count=0;
        if(low>=high)
        {
            return count;
        }
        int mid= (low+high)/2;
        count+=mergeSort(arr,low,mid); //first half
        count+=mergeSort(arr,mid+1,high);  //second half
        count+=merge(arr,low,mid,high);//  merging first and second halves
        return count;
    }

    public static int findInversionCount(int arr[])
    {
        int low= 0;
        int high= arr.length-1;
        return mergeSort(arr,low,high);      //call mergeSort method to find inversion
    }
    public static void main(String[] args) {
        int arr[]= {5, 4, 3, 2, 1};
        int ans= findInversionCount(arr);
        System.out.println(ans);
    }
}
