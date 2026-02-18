package leet_code_75.array_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCompressionTest {
    private final StringCompression stringCompression = new StringCompression();

    @Test
    void example1() {
        assertEquals(6, stringCompression.compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'}));
    }

    @Test
    void example2() {
        assertEquals(1, stringCompression.compress(new char[]{'a'}));
    }

    @Test
    void example3() {
        assertEquals(4, stringCompression.compress(new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'}));
    }

    @Test
    void example4() {
        assertEquals(6, stringCompression.compress(new char[]{'a', 'a', 'a', 'b', 'b', 'a', 'a'}));
    }
}
