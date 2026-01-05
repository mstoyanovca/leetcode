package leetcode150.array_string;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextJustificationTest {
    @Test
    public void example1Test() {
        assertEquals(
                List.of("This    is    an", "example  of text", "justification.  "),
                new TextJustification().fullJustify(new String[]{"This", "is", "an", "example", "of", "text", "justification."}, 16));
    }

    @Test
    public void example2Test() {
        assertEquals(
                List.of("What   must   be", "acknowledgment  ", "shall be        "),
                new TextJustification().fullJustify(new String[]{"What", "must", "be", "acknowledgment", "shall", "be"}, 16));
    }

    @Test
    public void example3Test() {
        assertEquals(
                List.of("Science  is  what we", "understand      well", "enough to explain to", "a  computer.  Art is", "everything  else  we", "do                  "),
                new TextJustification().fullJustify(
                        new String[]{"Science", "is", "what", "we", "understand", "well", "enough", "to", "explain", "to", "a", "computer.", "Art", "is", "everything", "else", "we", "do"},
                        20));
    }
}
