package leetcode150.binary_search;

public class MedianOfTwoSortedArrays {
    // if (aMid < bMid) keep [aRight + bLeft] else keep [bRight + aLeft]
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int left = 0;
        int right = m - 1;

        while (left <= right) {
            int middle1 = left + (right - left) / 2;
            int middle2 = (m + n + 1) / 2 - middle1;
        }

        return 0.0;
    }
}
// Concise JAVA solution based on Binary Search
