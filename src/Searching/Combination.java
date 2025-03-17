package Searching;

public class Combination {
    public static void main(String[] args) {
        int[] nums = new int[1000];
        nums[nums.length-1]=1000;
        int target = 1000;
        int left = 0;
        int right = nums.length - 1;
        int result = linearSearching(nums, target);
        int count = 0;
        int result1 = binarySearching(nums, target, left, right, count);
        if (result1 != -1)
            System.out.println("Element found at " + result1);
        else
            System.out.println("Element not fount");
    }

    public static int binarySearching(int[] nums, int target, int left, int right, int count) {
        if (left <= right) {
            count++;
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                System.out.println("Number of iterations : " + count);
                return mid;
            } else if (nums[mid] < target) {
                return binarySearching(nums, target, mid + 1, right, count);
            } else {
                return binarySearching(nums, target, left, mid - 1, count);
            }
        }
        return -1;
    }


    public static int linearSearching(int[] nums, int target) {
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            count++;
            if(nums[i]==target) {
                System.out.println("Number of iterations : "+count);
                return i;
            }
        }
        System.out.println("Number of iterations : "+count);
        return -1;
    }
}
