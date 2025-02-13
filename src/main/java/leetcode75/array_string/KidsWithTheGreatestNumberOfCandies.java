package leetcode75.array_string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int greatestNumberOfCandies = Arrays.stream(candies).max().orElse(0);
        List<Boolean> result = new ArrayList<>();

        for (int candy : candies) {
            if (candy + extraCandies >= greatestNumberOfCandies) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }
}
