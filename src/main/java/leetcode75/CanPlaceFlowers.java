package leetcode75;

public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerBed, int n) {
        int counter = 0;

        for (int i = 0; i < flowerBed.length; i++) {
            int leftIndex = i == 0 ? 0 : i - 1;
            int rightIndex = i == flowerBed.length - 1 ? flowerBed.length - 1 : i + 1;

            if (flowerBed[leftIndex] == 0 && flowerBed[rightIndex] == 0) {
                counter++;
            }
        }

        return counter >= n;
    }
}
