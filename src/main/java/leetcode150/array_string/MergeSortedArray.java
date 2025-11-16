package leetcode150.array_string;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int inserts = 0;
        int startIndex = 0;

        for (int j = 0; j < n; j++) {
            for (int i = startIndex; i < (m + n); i++) {
                startIndex = i;
                if (nums1[i] > nums2[j] || (i >= m + inserts && nums1[i] == 0)) {
                    inserts++;
                    insert(nums1, i, nums2[j]);
                    break;
                }
            }
        }
    }

    public void insert(int[] numbers, int position, int number) {
        for (int i = position; i < numbers.length; i++) {
            int acc = numbers[i];
            numbers[i] = number;
            number = acc;
        }
    }
}
