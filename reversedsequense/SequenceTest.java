package reversedsequense;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SequenceTest {
    @Test
    public void test() {
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, Sequense.reverse(5));
    }
}
