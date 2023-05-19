package removeExclamationMarks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveExclamationMarksTest {

    @Test
    public void testSimpleString1() {
        Assertions.assertEquals("Hello World", RemoveExclamationMarks.removeExclamationMarks("Hello World!"));
    }
}
