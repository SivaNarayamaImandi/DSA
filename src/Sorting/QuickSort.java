package Sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {11, 4, 8, 63, 16, 83, 6, 92, 1};
        System.out.println("Before Sorted");
        for (int nums : arr) {
            System.out.print(nums + " ");
        }
        System.out.println("\n");

        quikSort(arr, 0, arr.length-1);

        System.out.println();
        System.out.println("After Sorted");
        for (int nums : arr) {
            System.out.print(nums + " ");
        }
    }

    public static void quikSort(int[] arr, int low, int high) {
        if (low<high) {
            int pivot = partition(arr, low, high);
            quikSort(arr,low,pivot-1);
            quikSort(arr,pivot+1,high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low -1;
        for (int j = low; j < high; j++) {
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        for (int nums : arr) {
            System.out.print(nums + " ");
        }
        System.out.println();
        return i+1;
    }
}
