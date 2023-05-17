package greet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void testSomething() {
        Assertions.assertEquals("Hello, Ryan how are you doing today?", Kata.greet("Ryan"));
    }
}
