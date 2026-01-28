package dsa_tutorial;

public class MergeTwoSortedArrays {
    // most efficient is the two pointer approach
    // time complexity O(m + n)
    // space complexity O(m + n)
    public int[] mergeSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] result = new int[m + n];
        int i = 0;  // nums1 pointer
        int j = 0;  // nums2 pointer
        int k = 0;  // result pointer

        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                result[k] = nums1[i];
                i++;
            } else {
                result[k] = nums2[j];
                j++;
            }
            k++;
        }

        // there might be elements left from either nums1 or nums2, add them to the result:
        while (i < m) {
            result[k] = nums1[i];
            i++;
            k++;
        }

        while (j < n) {
            result[k] = nums2[j];
            j++;
            k++;
        }

        return result;
    }
}
