package Sorting;

public class MargeSort {
    public static void main(String[] args) {
        int[] arr = {11, 4, 8, 63, 16, 83, 6, 92, 1, 100};
        System.out.println("Before Sorted");
        for (int nums : arr) {
            System.out.print(nums + " ");
        }
        System.out.println("\n");

        margeSort(arr, 0, arr.length - 1);

        System.out.println();
        System.out.println("After Sorted");
        for (int nums : arr) {
            System.out.print(nums + " ");
        }
    }

    public static void margeSort(int[] arr, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            margeSort(arr, l, mid);
            margeSort(arr, mid + 1, r);
            margeArrays(arr, l, mid, r);
        }
    }

    public static void margeArrays(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int[] lArr = new int[n1];
        int[] rArr = new int[n2];
        for (int x = 0; x < n1; x++) {
            lArr[x] = arr[l + x];
        }
        for (int x = 0; x < n2; x++) {
            rArr[x] = arr[mid + 1 + x];
        }
        int i = 0;
        int j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (lArr[i] <= rArr[j]) {
                arr[k] = lArr[i];
                i++;
            } else {
                arr[k] = rArr[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = lArr[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = rArr[j];
            j++;
            k++;
        }
        for (int nums : arr) {
            System.out.print(nums + " ");
        }
        System.out.println();
    }
}
