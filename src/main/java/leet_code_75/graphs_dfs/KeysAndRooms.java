package leet_code_75.graphs_dfs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toCollection;

// problem 43:
public class KeysAndRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        List<Boolean> openedRooms = IntStream.range(0, rooms.size()).mapToObj(i -> i == 0).collect(toCollection(ArrayList::new));
        dfs(rooms, openedRooms, 0);
        return !openedRooms.contains(false);
    }

    private void dfs(List<List<Integer>> rooms, List<Boolean> openedRooms, int index) {
        for (int key : rooms.get(index)) {
            if (!openedRooms.get(key)) {
                openedRooms.set(key, true);
                dfs(rooms, openedRooms, key);
            }
        }
    }
}
