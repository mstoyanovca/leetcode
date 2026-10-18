package core_java.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Streams {
    static void main(String[] args) {
        String[] array0 = {"Apple", "Orange", "Pear", "Plum", "Banana", "Orange"};
        String[] array1 = Arrays.stream(array0).distinct().toArray(String[]::new);
        System.out.println(Arrays.toString(array1));

        List<Integer> list = List.of(1, 2, 3, 4, 5);
        System.out.println(list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0));
    }
}
