package leetcode75.bit_manipulation;

// problem 69:
// Minimum Flips to Make a OR b Equal to c
public class MinimumFlips {
    public int minFlips(int a, int b, int c) {
        int flips = 0;

        while (a > 0 || b > 0 || c > 0) {
            int lsbA = a & 1;
            int lsbB = b & 1;
            int lsbC = c & 1;

            if (lsbC == 0) {
                flips += lsbA + lsbB;
            } else {
                if (lsbA == 0 && lsbB == 0) flips++;
            }

            a = a >> 1;
            b = b >> 1;
            c = c >> 1;
        }

        return flips;
    }
}
