package strCount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StrCountTest {
    @Test
    public void testSomething() {
        Assertions.assertEquals(1, StrCount.strCount("Hello", 'o'));
        Assertions.assertEquals(2, StrCount.strCount("Hello", 'l'));
        Assertions.assertEquals(0, StrCount.strCount("", 'z'));
    }
}
