package dsa_summary.array;

public class MergeSort {
    // divide-and-conquer algorithm
    // time complexity O(n * log(n))
    // space complexity O(n)
    public int[] mergeSort(int[] numbers) {
        split(0, numbers.length - 1, numbers);
        return numbers;
    }

    private void split(int left, int right, int[] array) {
        if (left >= right) return;
        int middle = left + (right - left) / 2;

        split(left, middle, array);
        split(middle + 1, right, array);

        merge(left, middle, right, array);
    }

    // this a classic time complexity O(m + n) merge algorithm
    private void merge(int left, int middle, int right, int[] array) {
        int m = middle - left + 1;
        int n = right - middle;
        int[] leftArray = new int[m];
        int[] rightArray = new int[n];

        for (int i = 0; i < m; i++) leftArray[i] = array[left + i];
        for (int j = 0; j < n; j++) rightArray[j] = array[middle + j + 1];

        int i = 0;
        int j = 0;
        int k = left;
        while (i < m && j < n) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < m) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
