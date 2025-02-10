package leetcode75;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] numbers) {
        int[] result = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            int temp = numbers[i];
            numbers[i] = 1;
            result[i] = product(numbers);
            numbers[i] = temp;
        }

        return result;
    }

    private int product(int[] temp) {
        int product = 1;
        for (int i : temp) {
            product = product * i;
        }
        return product;
    }
}
