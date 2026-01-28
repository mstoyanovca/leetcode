package dsa_tutorial.array;

public class FindKthElementInTwoSortedArrays {
    public int findKthElement(int[] a, int[] b, int k) {
        // start splitting the shorter array to achieve time complexity O(log(min(m, n)))
        // space complexity O(1)
        if (a.length > b.length) return findKthElement(b, a, k);
        int m = a.length;
        int n = b.length;
        int low = Math.max(0, k - n);
        int high = Math.min(k, m);

        while (low <= high) {
            int pa = (low + high) / 2;
            int pb = k - pa;

            int leftA = (pa == 0) ? Integer.MIN_VALUE : a[pa - 1];
            int rightA = (pa == m) ? Integer.MAX_VALUE : a[pa];

            int leftB = (pb == 0) ? Integer.MIN_VALUE : b[pb - 1];
            int rightB = (pb == n) ? Integer.MAX_VALUE : b[pb];

            if (leftA <= rightB && leftB <= rightA) {
                return Math.max(leftA, leftB);
            } else if (leftA > rightB) {
                high = pa - 1;
            } else {
                low = pa + 1;
            }
        }

        return 0;
    }
}
