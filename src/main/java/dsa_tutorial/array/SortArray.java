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
        sort(numbers, 0, numbers.length - 1);
        return numbers;
    }

    public static void sort(int[] arr, int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    public static void merge(int[] arr, int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        // Create temp arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        // Merge the temp arrays

        // Initial indices of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
