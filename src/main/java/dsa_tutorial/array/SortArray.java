package dsa_tutorial.array;

import java.util.Arrays;
import java.util.Comparator;

public class SortArray {
    public int[] sortAscending(int[] numbers) {
        Arrays.sort(numbers);
        return numbers;
    }

    public int[] sortDescending(int[] numbers) {
        return Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
    }

    /*
     * Java’s built-in sorting methods, such as Arrays.sort(), adapt their algorithm depending on the type of data being processed.
     * For primitive arrays like int[] or double[], Java uses Dual-Pivot Quick Sort, which tends to be faster in practice but doesn’t guarantee stable sorting.
     * For arrays of objects that implement Comparable, it switches to a hybrid sorting algorithm called TimSort. TimSort draws its structure from Merge Sort.
     *
     * Merge Sort is consistent in its time complexity and is a stable sorting algorithm. It is suitable for both arrays and linked lists but requires additional space.
     * Quick Sort is faster in practice and uses less auxiliary space compared to Merge Sort. It can perform poorly with certain datasets, leading to its worst-case time complexity of O(n²).
     */
    // divide-and-conquer algorithm
    // time complexity O(n * log(n))
    // space complexity O(n)
    public int[] mergeSort(int[] numbers) {
        sort(0, numbers.length - 1, numbers);
        return numbers;
    }

    public void sort(int left, int right, int[] array) {
        if (left >= right) return;
        int middle = left + (right - left) / 2;

        sort(left, middle, array);
        sort(middle + 1, right, array);

        merge(left, middle, right, array);
    }

    // this a classic O(m + n) merge algorithm
    public void merge(int left, int middle, int right, int[] array) {
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
