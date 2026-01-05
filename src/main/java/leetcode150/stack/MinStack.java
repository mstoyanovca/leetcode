package leetcode150.stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinStack {
    private final List<Integer> list;

    public MinStack() {
        this.list = new ArrayList<>();
    }

    public void push(int val) {
        list.add(val);
    }

    public void pop() {
        list.removeLast();
    }

    public int top() {
        return list.getLast();
    }

    public int getMin() {
        return Collections.min(list);
    }
}
