package leetcode150.array_string;

public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int currentGas = 0;
        int right = findNextPossibleStartIndex(0, gas, cost);

        // time complexity O(n^2)
        // space complexity O(1)
        while (right != -1) {
            boolean loop = true;

            for (int i = right; i < n; i++) {
                currentGas += gas[i] - cost[i];
                if (currentGas < 0) {
                    right = findNextPossibleStartIndex(right + 1, gas, cost);
                    currentGas = 0;
                    loop = false;
                    break;
                }
            }

            if (loop) {
                for (int i = 0; i < right; i++) {
                    currentGas += gas[i] - cost[i];
                    if (currentGas < 0) {
                        right = findNextPossibleStartIndex(right + 1, gas, cost);
                        currentGas = 0;
                        loop = false;
                        break;
                    }
                }

                if (loop) break;
            }
        }

        return right;
    }

    private int findNextPossibleStartIndex(int right, int[] gas, int[] cost) {
        for (int i = right; i < gas.length; i++) if (gas[i] >= cost[i]) return i;
        return -1;
    }
}
