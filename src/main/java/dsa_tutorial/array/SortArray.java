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
     * */
    public int[] mergeSort(int[] numbers) {
        return numbers;
    }
}
