package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {7, 3, 9, 1, 8, 4};
        for (int i = 1; i < arr.length; i++) {
            int sorted = arr[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (sorted < arr[j]) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = sorted;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

}
