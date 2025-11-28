package leetcode150.array_string;

public class Candy {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int currentCandies = 1;
        int totalCandies = n;

        for (int i = 0; i < n; i++) {
            if (i < n - 1 && ratings[i] > ratings[i + 1] || i > 0 && ratings[i] > ratings[i - 1]) {
                currentCandies++;
                totalCandies += currentCandies - 1;
            } else {
                currentCandies = 1;
            }
        }

        return totalCandies;
    }
}
