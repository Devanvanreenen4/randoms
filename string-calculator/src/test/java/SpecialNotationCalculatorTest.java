import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SpecialNotationCalculatorTest {

    private SpecialNotationCalculator calculator;

    @Before
    public void setup() {
        calculator = new SpecialNotationCalculator();
    }

    @Test
    public void shouldAddTwoNumbers() {
        assertThat(calculator.calculate("5 6 +"), is(11));
        assertThat(calculator.calculate("1 1 +"), is(2));
        assertThat(calculator.calculate("1 2 +"), is(3));
        assertThat(calculator.calculate("100 200 +"), is(300));

    }

    @Test
    public void shouldSubtractTwoNumbers() {
        assertThat(calculator.calculate("2 1 -"), is(1));
        assertThat(calculator.calculate("1 2 -"), is(-1));
    }


}
