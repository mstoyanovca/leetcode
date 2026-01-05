package leetcode150.array_string;

public class GasStation {
    // "If there exists a solution, it is guaranteed to be unique."
    // the solution below times out, a shortcut is needed;
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;
        int currentGas = 0;
        int right = 0;

        // time complexity O(n)
        // space complexity O(1)
        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];

            currentGas += gas[i] - cost[i];
            if (currentGas < 0) {
                currentGas = 0;
                right = i + 1;
            }
        }

        return totalGas < totalCost ? -1 : right;
    }

    public int canCompleteCircuitBruteForce(int[] gas, int[] cost) {
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
