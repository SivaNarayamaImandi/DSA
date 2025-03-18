package Sorting;

public class BobbleSort {
    public static void main(String[] args) {
        int[] arr = {11, 4, 8, 63, 16, 83, 6, 92, 1};
        int size = arr.length;
        int temp = 0;
        System.out.println("Before Sorted");
        for (int nums : arr) {
            System.out.print(nums + " ");
        }
        System.out.println("\n");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) { // (int j = 0; j < size - 1; j++) --> it is time complex
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            for (int nums : arr) {
                System.out.print(nums + " ");
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
