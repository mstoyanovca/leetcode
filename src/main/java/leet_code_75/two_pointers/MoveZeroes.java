package leet_code_75.two_pointers;

public class MoveZeroes {
    public void moveZeroes(int[] numbers) {
        int firstZeroElementPointer = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                if (firstZeroElementPointer > numbers.length - 1) firstZeroElementPointer = i;
            } else {
                if (firstZeroElementPointer < i) {
                    numbers[firstZeroElementPointer] = numbers[i];
                    numbers[i] = 0;
                    firstZeroElementPointer++;
                }
            }
        }
    }
}
