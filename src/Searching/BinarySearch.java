package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 39, 94, 202, 908, 9734};
        int left = 0;
        int target = 202;
        int right = numbers.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (numbers[mid] == target) {
                System.out.println("Element found at " + mid);
                break;
            } else if (numbers[mid] < target) {
                left = mid + 1;
            } else
                right = mid - 1;
        }
    }
}
