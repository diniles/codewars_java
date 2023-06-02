package humanYearsCatYearsDogYears;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class HumanYearsCatYearsDogYearsTest {
    @Test
    public void one() {
        assertArrayEquals(new int[]{1, 15, 15}, HumanYearsCatYearsDogYears.humanYearsCatYearsDogYears(1));
    }

    @Test
    public void two() {
        assertArrayEquals(new int[]{2, 24, 24}, HumanYearsCatYearsDogYears.humanYearsCatYearsDogYears(2));
    }

    @Test
    public void ten() {
        assertArrayEquals(new int[]{10, 56, 64}, HumanYearsCatYearsDogYears.humanYearsCatYearsDogYears(10));
    }
}
