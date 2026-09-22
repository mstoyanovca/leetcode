package leet_code_75.array_string;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int i : candies) if (i > max) max = i;

        List<Boolean> result = new ArrayList<>();
        for (int i : candies)
            if (i + extraCandies >= max) result.add(true);
            else result.add(false);
        return result;
    }
}
