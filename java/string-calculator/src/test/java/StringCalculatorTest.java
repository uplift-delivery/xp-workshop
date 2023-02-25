import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {
    @Test
    public void firstTest() {
        StringCalculator calculator = new StringCalculator();

        assertEquals(-1, calculator.add(""));
    }
}