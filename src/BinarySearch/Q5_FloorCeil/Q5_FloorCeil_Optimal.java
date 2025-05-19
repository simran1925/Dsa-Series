package BinarySearch.Q5_FloorCeil;

public class Q5_FloorCeil_Optimal
{
//  floor of x is the largest element in the array which is smaller than or equal to x.
    public static int findFloor(int arr[], int x)
    {
        int ans= arr.length;
        int start= 0;
        int end= arr.length-1;
        while (start<=end)
        {
            int mid= (start+end)/2;
            if(x>=arr[mid])
            {
                ans = arr[mid];
                start= mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return ans;
    }

//  ceiling of x is the smallest element in the array greater than or equal to x
public static int findCeil(int arr[], int x)
{
    int ans= arr.length;
    int start= 0;
    int end= arr.length-1;
    while (start<=end)
    {
        int mid= (start+end)/2;
        if(x<=arr[mid])
        {
            ans = arr[mid];
            end= mid-1;
        }
        else {
            start = mid+1;
        }
    }
    return ans;
}

    public static void main(String[] args) {
        int n = 6, arr[] ={3, 4, 4, 7, 8, 10}, x= 5;
        int floor= findFloor(arr,x);
       int ceil=  findCeil(arr,x);
        System.out.println("floor "+ floor);
        System.out.println("ceil "+ ceil);
    }
}
