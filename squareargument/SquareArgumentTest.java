package squareargument;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareArgumentTest {
    @Test
    void fixed_tests() {
        assertEquals(4, SquareArgument.square(2));
        assertEquals(2500, SquareArgument.square(50));
        assertEquals(1, SquareArgument.square(1));
    }
}
