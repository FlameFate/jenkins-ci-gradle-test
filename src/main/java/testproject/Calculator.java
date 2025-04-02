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
/** Class to make some very difficult calculations */
public class Calculator {
    private Calculator() {
    }

    /**
     * Performs summation of two numbers.
     * @param x First argument
     * @param y Second argument
     * @return Sum of the two numbers
     */
    public static int sum(int x, int y) {
        return x + y;
    }

    /**
     * Subtracts from the first argument the value of the second number.
     * @param x First argument
     * @param y Second argument
     * @return Difference between the first and the second number
     */
    public static int subtract(int x, int y) {
        return x - y;
    }
}

