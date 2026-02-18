package leet_code_75.graphs_dfs;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toCollection;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class KeysAndRoomsTest {
    private final KeysAndRooms keysAndRooms = new KeysAndRooms();

    @Test
    void example1() {
        List<List<Integer>> rooms = new ArrayList<>();
        rooms.add(Stream.of(1).collect(toCollection(ArrayList::new)));
        rooms.add(Stream.of(2).collect(toCollection(ArrayList::new)));
        rooms.add(Stream.of(3).collect(toCollection(ArrayList::new)));
        rooms.add(new ArrayList<>());

        assertTrue(keysAndRooms.canVisitAllRooms(rooms));
    }

    @Test
    void example2() {
        List<List<Integer>> rooms = new ArrayList<>();
        rooms.add(Stream.of(1, 3).collect(toCollection(ArrayList::new)));
        rooms.add(Stream.of(3, 0, 1).collect(toCollection(ArrayList::new)));
        rooms.add(Stream.of(2).collect(toCollection(ArrayList::new)));
        rooms.add(Stream.of(0).collect(toCollection(ArrayList::new)));

        assertFalse(keysAndRooms.canVisitAllRooms(rooms));
    }

    @Test
    void example3() {
        List<List<Integer>> rooms = new ArrayList<>();
        rooms.add(Stream.of(4).collect(toCollection(ArrayList::new)));
        rooms.add(Stream.of(3).collect(toCollection(ArrayList::new)));
        rooms.add(new ArrayList<>());
        rooms.add(Stream.of(2, 5, 7).collect(toCollection(ArrayList::new)));
        rooms.add(Stream.of(1).collect(toCollection(ArrayList::new)));
        rooms.add(new ArrayList<>());
        rooms.add(Stream.of(8, 9).collect(toCollection(ArrayList::new)));
        rooms.add(new ArrayList<>());
        rooms.add(new ArrayList<>());
        rooms.add(Stream.of(6).collect(toCollection(ArrayList::new)));

        assertFalse(keysAndRooms.canVisitAllRooms(rooms));
    }
}
