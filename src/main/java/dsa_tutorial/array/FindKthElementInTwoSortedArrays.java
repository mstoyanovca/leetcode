package dsa_tutorial.array;

public class FindKthElementInTwoSortedArrays {
    public int findKthElement(int[] a, int[] b, int k) {
        // start splitting the shorter array to achieve time complexity O(log(min(m, n)))
        // space complexity O(1)
        if (a.length > b.length) return findKthElement(b, a, k);
        int m = a.length;
        int n = b.length;
        int left = Math.max(0, k - n);
        int right = Math.min(k, m);

        while (left <= right) {
            int i = (left + right) / 2;
            int j = k - i;

            int leftA = (i == 0) ? Integer.MIN_VALUE : a[i - 1];
            int rightA = (i == m) ? Integer.MAX_VALUE : a[i];

            int leftB = (j == 0) ? Integer.MIN_VALUE : b[j - 1];
            int rightB = (j == n) ? Integer.MAX_VALUE : b[j];

            if (leftA <= rightB && leftB <= rightA) {
                return Math.max(leftA, leftB);
            } else if (leftA > rightB) {
                right = i - 1;
            } else {
                left = i + 1;
            }
        }

        return 0;
    }
}
