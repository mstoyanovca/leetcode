package dsa_summary.array;

public class MergeSortTemp {
    // time complexity O(n * log(n))
    // space complexity O(n)
    public int[] mergeSort(int[] numbers) {
        int n = numbers.length;
        split(0, n - 1, numbers);
        return numbers;
    }

    private void split(int left, int right, int[] numbers) {
        if (left >= right) return;
        int middle = left + (right - left) / 2;

        split(left, middle, numbers);
        split(middle + 1, right, numbers);

        merge(left, middle, right, numbers);
    }


    private void merge(int left, int middle, int right, int[] numbers) {
        int m = middle - left + 1;
        int n = right - middle;
        int[] leftArray = new int[m];
        int[] rightArray = new int[n];

        for (int i = 0; i < m; i++) leftArray[i] = numbers[left + i];
        for (int i = 0; i < n; i++) rightArray[i] = numbers[middle + i + 1];

        int i = 0;
        int j = 0;
        int k = left;
        while (i < m && j < n) {
            if (leftArray[i] < rightArray[j]) {
                numbers[k] = leftArray[i];
                i++;
            } else {
                numbers[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < m) {
            numbers[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n) {
            numbers[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
