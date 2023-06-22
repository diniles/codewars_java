package IsEven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsEvenTest {

    @Test
    public void test() {
        assertEquals(true, IsEven.isEven(0));
        assertEquals(false, IsEven.isEven(0.5));
        assertEquals(false, IsEven.isEven(1));
        assertEquals(true, IsEven.isEven(2));
        assertEquals(true, IsEven.isEven(-4));
    }
}
