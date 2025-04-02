package testproject;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testSum() {
        int result = Calculator.sum(2, 3);
        assertEquals(5, result, "Сумма 2 и 3 должна быть равна 5");
    }
}
