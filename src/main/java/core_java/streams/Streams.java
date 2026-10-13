package core_java.streams;

import java.util.Comparator;
import java.util.List;

public class Streams {
    static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        System.out.println(list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0));
    }
}
