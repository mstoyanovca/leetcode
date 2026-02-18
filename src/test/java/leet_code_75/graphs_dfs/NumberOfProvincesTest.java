package leet_code_75.graphs_dfs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfProvincesTest {
    private final NumberOfProvinces numberOfProvinces = new NumberOfProvinces();

    @Test
    void example1() {
        int[][] isConnected = {
                {1, 1, 0},
                {1, 1, 0},
                {0, 0, 1}};

        assertEquals(2, numberOfProvinces.findCircleNum(isConnected));
    }

    @Test
    void example2() {
        int[][] isConnected = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}};

        assertEquals(3, numberOfProvinces.findCircleNum(isConnected));
    }

    @Test
    void example3() {
        int[][] isConnected = {
                {1, 0, 0, 1},
                {0, 1, 1, 0},
                {0, 1, 1, 1},
                {1, 0, 1, 1}};

        assertEquals(1, numberOfProvinces.findCircleNum(isConnected));
    }
}
