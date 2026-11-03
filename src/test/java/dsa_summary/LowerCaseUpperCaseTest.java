package dsa_summary;

import org.junit.jupiter.api.Test;

import static dsa_summary.LowerCaseUpperCase.count;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LowerCaseUpperCaseTest {
    @Test
    public void example1Test() {
        assertEquals(2, count("aaAbcCB"));
    }

    @Test
    public void example2Test() {
        assertEquals(6, count("xyzXYZabcABC"));
    }

    @Test
    public void example3Test() {
        assertEquals(0, count("abcdCE"));
    }

    @Test
    public void example4Test() {
        assertEquals(3, count("abcdBCD"));
    }
}
