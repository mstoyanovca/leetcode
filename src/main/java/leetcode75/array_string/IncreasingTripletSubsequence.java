package leetcode75.array_string;

public class IncreasingTripletSubsequence {
    public boolean increasingTriplet(int[] numbers) {
        int min = Integer.MAX_VALUE;
        int medium = Integer.MAX_VALUE;

        for (int number : numbers) {
            if (number > medium) {
                return true;
            }
            if (number < min) {
                min = number;
            }
            if (number > min) {
                medium = number;
            }
        }

        return false;
    }
}
