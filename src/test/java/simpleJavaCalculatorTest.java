import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class simpleJavaCalculatorTest {

    @Test
    public void twoPlusTwoShouldEqualFour(){
        var calculator = new simpleJavaCalculator();
        assertEquals(4, calculator.add(2, 2));
    }


}