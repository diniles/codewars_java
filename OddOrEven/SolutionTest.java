package OddOrEven;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void exampleTest() {
        assertEquals("odd", OddOrEven.oddOrEven(new int[]{2, 5, 34, 6}));
    }
}
