package unique;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindUniqNumberTest {
    private double precision = 0.0000000000001;

    @Test
    public void sampleTestCases() {
        assertEquals(1.0, FindUniqNumber.findUniq(new double[]{0, 1, 0}), precision);
        assertEquals(2.0, FindUniqNumber.findUniq(new double[]{1, 1, 1, 2, 1, 1}), precision);
    }
}
