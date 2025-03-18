package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {11, 4, 8, 63, 16, 83, 6, 92, 1}; // It is one type of sort but it is Shifting the values Not Sorting
        System.out.println("Before Sorted");
        for (int nums : arr) {
            System.out.print(nums + " ");
        }
        System.out.println("\n");
        // Explanation for only two iterations
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i]; // 4, 8
            int j = i - 1; // j= 0, 1
            while (j >= 0 && arr[j] > key) { // 11 > 4, 11 > 8
                arr[j + 1] = arr[j]; // arr = *4 11* 8 63 16 83 6 92 1, 4 *8 11* 63 16 83 6 92 1
                j--; // -1 --> false, 0 --> true
            }
            arr[j + 1] = key; // key = 4, arr[j+1] = 4, key = 8
            for (int nums : arr) {
                System.out.print(nums + " "); // arr = 4 11 8 63 16 83 6 92 1, arr[j+1] = 4 8 11 63 16 83 6 92 1
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("After Sorted");
        for (int nums : arr) {
            System.out.print(nums + " ");
        }
    }
}
