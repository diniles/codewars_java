package greetMe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetMeTests {
    @Test
    public void basicTests() {
        assertEquals("Hello Riley!", GreetMe.greet("riley"));
    }
}
