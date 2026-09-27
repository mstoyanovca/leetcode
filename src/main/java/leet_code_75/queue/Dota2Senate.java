package leet_code_75.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Dota2Senate {
    static final String RADIANT = "Radiant";
    static final String DIRE = "Dire";
    private final Queue<Integer> radiant = new ArrayDeque<>();
    private final Queue<Integer> dire = new ArrayDeque<>();

    public String predictPartyVictory(String senate) {
        int n = senate.length();

        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R') {
                radiant.add(i);
            } else {
                dire.add(i);
            }
        }

        while (!radiant.isEmpty() && !dire.isEmpty()) {
            if (radiant.element() < dire.element()) {
                radiant.add(n++);
            } else if (dire.element() != -1 && (dire.element() < radiant.element())) {
                dire.add(n++);
            }
            radiant.remove();
            dire.remove();
        }

        return radiant.isEmpty() ? DIRE : RADIANT;
    }
}
