package IsEven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IsEvenTest {

    @Test
    public void test() {
        assertTrue(IsEven.isEven(0));
        assertFalse(IsEven.isEven(0.5));
        assertFalse(IsEven.isEven(1));
        assertTrue(IsEven.isEven(2));
        assertTrue(IsEven.isEven(-4));
    }
}
