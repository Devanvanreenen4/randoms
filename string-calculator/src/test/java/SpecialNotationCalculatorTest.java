import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SpecialNotationCalculatorTest {

    @Test
    public void shouldCalculateUsingInput() {
        SpecialNotationCalculator calculator = new SpecialNotationCalculator();
        assertThat(calculator.calculate("5 6 +"), is(11));
        assertThat(calculator.calculate("1 1 +"), is(2));

    }
}
