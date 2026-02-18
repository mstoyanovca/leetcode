package top_interview_150.two_pointers;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TripletSumTest {
    @Test
    public void example1Test() {
        assertEquals(List.of(List.of(-1, -1, 2), List.of(-1, 0, 1)), new TripletSum().threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }

    @Test
    public void example2Test() {
        assertEquals(List.of(), new TripletSum().threeSum(new int[]{0, 1, 1}));
    }

    @Test
    public void example3Test() {
        assertEquals(List.of(List.of(0, 0, 0)), new TripletSum().threeSum(new int[]{0, 0, 0}));
    }

    @Test
    public void example4Test() {
        assertEquals(List.of(List.of(-70, -60, 130), List.of(-100, -60, 160)), new TripletSum().threeSum(new int[]{-100, -70, -60, 110, 120, 130, 160}));
    }
}
