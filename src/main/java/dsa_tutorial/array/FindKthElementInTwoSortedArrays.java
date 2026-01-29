package dsa_tutorial.array;

public class FindKthElementInTwoSortedArrays {
    // time complexity O(log(min(m, n)))
    // space complexity O(1)
    public int findKthElement(int[] a, int[] b, int k) {
        if (a.length > b.length) return findKthElement(b, a, k);

        int m = a.length;
        int n = b.length;
        // number of elements from 'a' can range from max(0, k - m) to min(k, n):
        int min = Math.max(0, k - n);  // 0
        int max = Math.min(k, m);      // 4

        while (min <= max) {
            int m1 = (min + max) / 2;  // 2 elements from a
            int m2 = k - m1;           // 3 elements from b

            // the four boundary elements for both partitions:
            int l1 = m1 > 0 ? a[m1 - 1] : Integer.MIN_VALUE;  // 1
            int r1 = m1 < m ? a[m1] : Integer.MAX_VALUE;      // 2
            int l2 = m2 > 0 ? b[m2 - 1] : Integer.MIN_VALUE;  // 2
            int r2 = m2 < n ? b[m2] : Integer.MAX_VALUE;      // 2

            if (l1 <= r2 && l2 <= r1) {
                // a valid partition:
                return Math.max(l1, l2);
            } else if (l1 > r2) {
                // take less from a:
                max = m1 - 1;
            } else {
                // take more from a:
                min = m1 + 1;
            }
        }

        return -1;
    }
}
