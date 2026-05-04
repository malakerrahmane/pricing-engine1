import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PriceCalculatorTest {

    @Test
    void testCalc() {

        PriceCalculator pc = new PriceCalculator();

        double[] prices = {100, 50};
        int[] qty = {1, 1};

        double result = pc.calc(prices, qty, "SAVE10", "REGULAR");

        assertTrue(result > 0);
    }
}