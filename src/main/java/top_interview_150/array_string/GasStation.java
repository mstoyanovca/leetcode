package top_interview_150.array_string;

public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int totalGas = 0;
        int totalCost = 0;
        int currentGas = 0;
        int result = 0;

        // time complexity O(n)
        // space complexity O(1)
        for (int i = 0; i < n; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
            currentGas += gas[i] - cost[i];

            if (currentGas < 0) {
                currentGas = 0;
                result = i + 1;
            }
        }

        return totalGas < totalCost ? -1 : result;
    }
}
