package leetcode150.array_string;

import java.util.Arrays;

public class Candy {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] candies = new int[n];

        // time complexity O(n)
        // space complexity O(n)
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                candies[0] = 1;
            } else {
                if (ratings[i] > ratings[i - 1]) {
                    candies[i] = candies[i - 1] + 1;
                } else {
                    candies[i] = 1;
                }
            }
        }

        for (int i = n - 1; i > 0; i--) {
            if (ratings[i - 1] > ratings[i] && candies[i - 1] <= candies[i]) {
                candies[i - 1] = candies[i] + 1;
            }
        }

        return Arrays.stream(candies).sum();
    }
}
