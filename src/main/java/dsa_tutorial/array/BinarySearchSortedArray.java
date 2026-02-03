package dsa_tutorial.array;

public class BinarySearchSortedArray {
    // time complexity O(log(n))
    // space complexity O(1)
    // return the index of target, or -1
    public int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (arr[middle] == target) return middle;

            if (target < arr[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        return -1;
    }
}
