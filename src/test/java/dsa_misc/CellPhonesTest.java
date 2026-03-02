package dsa_misc;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CellPhonesTest {
    @Test
    public void example1Test() {
        assertEquals(List.of(0, 1, 2, 0), new CellPhones().talk(new int[][]{{10, 15}, {10, 15}, {10, 15}}, 40));
    }

    @Test
    public void example2Test() {
        assertEquals(List.of(0, 1, 0), new CellPhones().talk(new int[][]{{10, 5}, {10, 5}}, 30));
    }
}
