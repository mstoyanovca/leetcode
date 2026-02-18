package leet_code_75.hashmap_set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDifferenceOfTwoArrays {


    public List<List<Integer>> findDifference(int[] numbers0, int[] numbers1) {
        List<Integer> answer0 = new ArrayList<>();
        List<Integer> answer1 = new ArrayList<>();
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(answer0);
        answer.add(answer1);

        Set<Integer> set0 = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();

        for (int number : numbers0) {
            set0.add(number);
        }
        for (int number : numbers1) {
            set1.add(number);
        }
        for (int i : set0) {
            if (!set1.contains(i)) answer0.add(i);
        }
        for (int i : set1) {
            if (!set0.contains(i)) answer1.add(i);
        }

        return answer;
    }
}
