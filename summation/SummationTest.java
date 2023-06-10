package summation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SummationTest {
    @Test
    public void test1() {
        assertEquals(1, Summation.summation(1));
    }

    @Test
    public void test2() {
        assertEquals(36, Summation.summation(8));
    }
}
