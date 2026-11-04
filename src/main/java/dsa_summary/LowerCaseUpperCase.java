package dsa_summary;

import java.util.ArrayList;
import java.util.List;

public class LowerCaseUpperCase {
    public static int count(String letters) {
        int n = letters.length();
        int i = 0;
        List<Character> lowers = new ArrayList<>();
        List<Character> uppers = new ArrayList<>();
        int result = 0;

        while (i < n) {
            while (i < n && Character.isLowerCase(letters.charAt(i))) {
                lowers.add(letters.charAt(i));
                i++;
            }
            while (i < n && Character.isUpperCase(letters.charAt(i))) {
                uppers.add(Character.toLowerCase(letters.charAt(i)));
                i++;
            }
            if (lowers.isEmpty()) uppers.clear();

            if (!lowers.isEmpty() && !uppers.isEmpty()) {
                if (lowers.getLast() == uppers.getFirst()) {
                    result++;
                    lowers.clear();
                    uppers.clear();
                } else {
                    int first = lowers.indexOf(uppers.getFirst());
                    int last = uppers.indexOf(lowers.getLast());
                    if (lowers.subList(first, lowers.size()).equals(uppers.subList(0, last + 1))) {
                        result += lowers.subList(first, lowers.size()).size();
                        lowers.clear();
                        uppers.clear();
                    }
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
        System.out.println("AABcCDe = " + count("AABcCDe"));  // should be 1
    }
}
