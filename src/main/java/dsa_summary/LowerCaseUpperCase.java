package dsa_summary;

import java.util.ArrayList;
import java.util.List;

public class LowerCaseUpperCase {
    public static int count(String letters) {
        int n = letters.length();
        List<Character> list = new ArrayList<>();
        int result = 0;

        for (int i = 0; i < n; i++) {
            char c = letters.charAt(i);

            if (Character.isLowerCase(c)) {
                list.add(c);
            } else {
                if (list.contains(Character.toLowerCase(c))) {
                    result++;
                }
            }
        }

        return result;
    }

    static void main(String[] args) {
        System.out.println("aaAbcCB = " + count("aaAbcCB"));  // should be 2
        System.out.println("xyzXYZabcABC = " + count("xyzXYZabcABC"));  // should be 6
        System.out.println("abcdCE = " + count("abcdCE"));  // should be 0
        System.out.println("abcdBCDE = " + count("abcdBCDE"));  // should be 3
    }
}
