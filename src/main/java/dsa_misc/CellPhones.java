package dsa_misc;

import java.util.ArrayList;
import java.util.List;

public class CellPhones {
    /* int[][] cellphones = new int[][]{{10, 15}, {10, 15}, {10, 15}};
       cellphone0 talks 10 minutes, charges 15 minutes, etc.
       start talking on the first phone, till the battery is empty, plug it in to charge
       continue talking on the second, third phone, etc., till one of the previous phones has fully charged
       return to a previous phone with the lowest index, which has fully charged
       return the index of the phones, in the order talked for 'time' minutes
       for time = 40 minutes:
       talk on cellphone0 for 10 minutes, plug it in to charge (timestamp 0 to 10, it will be fully charged at timestamp 25);
       talk on cellphone1 for 10 minutes, plug it in to charge (timestamp 10 to 20, it will be fully charged at timestamp 35);
       talk on cellphone2 for 10 minutes, plug it in to charge (timestamp 20 to 30, it will be fully charged at timestamp 45);
       return to cellphone0 for 10 minutes, done;
       result should be List.of(0, 1, 2, 0);
    */
    public List<Integer> talk(int[][] cellphones, int time) {
        int n = cellphones.length;
        int[] availableAt = new int[n];
        int timestamp = 0;
        List<Integer> result = new ArrayList<>();

        while (timestamp < time) {
            for (int i = 0; i < n; i++) {
                if (availableAt[i] <= timestamp) {
                    timestamp += cellphones[i][0];
                    availableAt[i] = timestamp + cellphones[i][1];
                    result.add(i);
                    break;
                }
            }
        }


        return result;
    }
}
