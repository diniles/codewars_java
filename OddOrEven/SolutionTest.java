package OddOrEven;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void exampleTest() {
        assertEquals("odd", OddOrEven.oddOrEven(new int[]{2, 5, 34, 6}));
    }
}
