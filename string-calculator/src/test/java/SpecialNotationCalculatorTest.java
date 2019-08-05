import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by f4725816 on 2019/08/05.
 */
public class SpecialNotationCalculatorTest {

    @Test
    public void shouldCalculateUsingInput() {
        SpecialNotationCalculator calculator = new SpecialNotationCalculator();
        assertThat(calculator.calculate("5 6 +"), is(11));

    }
}
