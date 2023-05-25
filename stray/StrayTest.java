package stray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrayTest {
    @Test
    public void simpleArray1() {
        assertEquals(2, getActualFor(1, 1, 2));
    }

    private int getActualFor(int... numbers) {
        return Stray.stray(numbers);
    }
}
