package leetcode150.binary_search;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) return findMedianSortedArrays(nums2, nums1);

        int m = nums1.length;
        int n = nums2.length;
        int min = 0;
        int max = m;

        while (min <= max) {
            int m1 = (min + max) / 2;
            int m2 = (m + n + 1) / 2 - m1;

            // the four boundary elements for both partitions:
            int l1 = m1 > 0 ? nums1[m1 - 1] : Integer.MIN_VALUE;
            int r1 = m1 < m ? nums1[m1] : Integer.MAX_VALUE;
            int l2 = m2 > 0 ? nums2[m2 - 1] : Integer.MIN_VALUE;
            int r2 = m2 < n ? nums2[m2] : Integer.MAX_VALUE;

            // the array l2-r2 is within l1-r1: l1, l2, r2, r1
            if (l1 <= r2 && l2 <= r1) {
                // a valid partition:
                if ((m + n) % 2 == 0) {
                    return (double) (Math.max(l1, l2) + Math.min(r1, r2)) / 2;
                } else {
                    return Math.max(l1, l2);
                }
            } else if (l1 > r2) {
                // take less from nums1:
                max = m1 - 1;
            } else {
                // take more from nums1:
                min = m1 + 1;
            }
        }

        return 0;
    }
}
