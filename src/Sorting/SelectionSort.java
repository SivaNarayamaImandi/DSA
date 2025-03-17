package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {11,4,8,63,16,83,6,92,1};
        int size = arr.length;
        int temp = 0;
        int minValueIndex = -1;
        System.out.println("Before Sorted");
        for (int nums : arr){
            System.out.print(nums+ " ");
        }
        System.out.println("\n");

        for (int i = 0; i < size-1; i++) {
            minValueIndex = i;
            for (int j = i+1; j < size; j++) {
                if(arr[minValueIndex] > arr[j])
                    minValueIndex = j;
            }
            temp = arr[minValueIndex];
            arr[minValueIndex] = arr[i];
            arr[i] = temp;
            for (int nums : arr){
                System.out.print(nums+ " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("After Sorted");
        for (int nums : arr){
            System.out.print(nums+ " ");
        }
    }
}
