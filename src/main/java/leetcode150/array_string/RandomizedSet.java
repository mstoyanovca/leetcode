package leetcode150.array_string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RandomizedSet {
    private final Set<Integer> set;

    public RandomizedSet() {
        set = new HashSet<>();
    }

    public boolean insert(int val) {
        if (set.contains(val)) {
            return false;
        } else {
            set.add(val);
            return true;
        }
    }

    public boolean remove(int val) {
        if (set.contains(val)) {
            set.remove(val);
            return true;
        } else {
            return false;
        }
    }

    public int getRandom() {
        return new ArrayList<>(set).get((int) (Math.random() * set.size()));
    }
}
