package Sorting;

public class MergeSort
{
    public static void conquer(int arr[], int mid, int s, int e)
    {
        //Lastly merge the arrays
        //here the first step is to take another array where we will store the merged array
        int merged[]= new int[e-s+1];
        //2nd step in conquer is : define the indexes
        int indx1= s;   //take the index for array1
        int indx2=mid+1; //take the index for array 2
        int x=0;  //for merged array

        //3rd step in conquer
        //now based on condition i.e. who is smaller add them in merged array
        while(indx1<=mid && indx2<=e)
        {
            if(arr[indx1]<=arr[indx2])
            {
                merged[x++]= arr[indx1++];
            }
            else if(arr[indx2]<=arr[indx1])
            {
                merged[x++]= arr[indx2++];
            }
        }

        //don't forget if any array is remained left from comparison in both arrays
        while(indx1 <= mid) {
            merged[x++]= arr[indx1++];
        }

        while(indx2 <= e) {
            merged[x++]= arr[indx2++];
        }

        //now just copy the merged array into original array
        //take the indexes carefully here
        for(int i=0,j=s;i<merged.length;i++,j++)
        {
            arr[j]=merged[i];
        }
    }
    public static void divide(int arr[], int s, int e)
    {
        //Firstly divide
        //4th step is to add base case
        if(s>=e)
        {
            return;
        }
        int mid = s+ (e-s)/2;   //first step to find the mid
        divide(arr,s,mid);   //2nd step is to divide both the arrays
        divide(arr,mid+1,e);
        //3rd step is conquer them
        conquer(arr,mid,s,e);
    }
    public static void main(String[] args)
    {
        int arr[]= {1,10,5,4,3,9,6};
        divide(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
}
