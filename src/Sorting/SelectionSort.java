package Sorting;
public class SelectionSort
{
    public static void main(String[] args) {

        int arr[]= {1,7,6,5,4,2,3};
        for(int i=0;i<arr.length-1;i++)
        {
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[minIndex]>arr[j])
                {
                    minIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
