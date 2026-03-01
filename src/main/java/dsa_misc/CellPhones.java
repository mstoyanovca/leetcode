package dsa_misc;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CellPhones {
    /* int[][] cellphones = new int[][]{{10, 15}, {10, 15}, {10, 15}};
       cellphone0 talks 10 minutes, charges 15 minutes, etc.
       start talking on the first phone, till the battery is dead, plug it in to charge
       continue talking on the second phone, etc., till one of the previous phones is charged
       return to a previous phone, which charges first
       return the index of the phones, in the order talked for 'time' minutes
       for time = 30 minutes:
       talk on cellphone0 for 10 minutes, plug it in to charge;
       talk on cellphone1 for 5 minutes, while cellphone0 is fully charged;
       switch back to cellphone0 for 10 minutes, plug it in to charge;
       talk on cellphone1 for another 5 minutes, done;
       result should be List.of(0, 1, 0, 1);
    */
    public List<Integer> talk(int[][] cellphones, int time) {
        List<CellPhone> phones = new ArrayList<>();
        for (int[] cellphone : cellphones) {
            phones.add(new CellPhone(cellphone[0], cellphone[1]));
        }
        int currentPhone = 0;
        int timestamp = 0;
        List<Integer> result = new ArrayList<>();

        while (timestamp < time) {
            int nextConversation;
            if (currentPhone == 0) {
                result.add(currentPhone);
                nextConversation = phones.get(currentPhone).talkTime;
                timestamp += nextConversation;
                phones.get(currentPhone).talkTime -= nextConversation;
                currentPhone++;
            } else {
                if (phones.get(currentPhone - 1).chargeTime > phones.get(currentPhone).talkTime) {
                    result.add(currentPhone);
                    nextConversation = phones.get(currentPhone).talkTime;
                    timestamp += nextConversation;
                    phones.get(currentPhone).talkTime -= nextConversation;
                    currentPhone++;
                } else {
                    nextConversation = phones.get(currentPhone - 1).chargeTime;
                    timestamp += nextConversation;
                    phones.get(currentPhone).talkTime -= nextConversation;
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
