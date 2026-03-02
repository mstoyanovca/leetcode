package dsa_misc;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
       talk on cellphone1 for another 5 minutes, done;
       result should be List.of(0, 1, 2, 0);
    */
    public List<Integer> talk(int[][] cellphones, int time) {
        List<CellPhone> phones = new ArrayList<>();
        for (int[] cellphone : cellphones) {
            phones.add(new CellPhone(cellphone[0], cellphone[1]));
        }
        int currentPhone = 0;
        int totalConversationTime = 0;
        List<Integer> result = new ArrayList<>();

        while (totalConversationTime < time) {
            int currentConversationTime;
            if (currentPhone == 0) {
                result.add(currentPhone);
                currentConversationTime = phones.get(currentPhone).talkTime;
                totalConversationTime += currentConversationTime;
                phones.get(currentPhone).talkTime -= currentConversationTime;
                currentPhone++;
            } else {
                if (phones.get(currentPhone - 1).chargeTime > phones.get(currentPhone).talkTime) {
                    result.add(currentPhone);
                    currentConversationTime = phones.get(currentPhone).talkTime;
                    totalConversationTime += currentConversationTime;
                    phones.get(currentPhone).talkTime -= currentConversationTime;
                    currentPhone++;
                } else {
                    currentConversationTime = phones.get(currentPhone - 1).chargeTime;
                    totalConversationTime += currentConversationTime;
                    phones.get(currentPhone).talkTime -= currentConversationTime;
                    currentPhone++;
                }
            }
        }

        return result;
    }

    private static class CellPhone {
        int talkTime;
        int chargeTime;

        public CellPhone(int talkTime, int chargeTime) {
            this.talkTime = talkTime;
            this.chargeTime = chargeTime;
        }

        @Override
        public boolean equals(Object o) {
            if (!(o instanceof CellPhone cellPhone)) return false;
            return talkTime == cellPhone.talkTime && chargeTime == cellPhone.chargeTime;
        }

        @Override
        public int hashCode() {
            return Objects.hash(talkTime, chargeTime);
        }
    }
}
