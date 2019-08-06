package za.co.assessment.calculator;

import org.junit.Before;
import org.junit.Test;
import za.co.assessment.calculator.application.SpecialNotationCalculator;

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

    @Test
    public void shouldMultiplyTwoNumbers() {
        assertThat(calculator.calculate("2 1 x"), is(2));
        assertThat(calculator.calculate("5 5 x"), is(25));
    }

    @Test
    public void shouldDivideTwoNumbers() {
        assertThat(calculator.calculate("10 2 /"), is(5));
        assertThat(calculator.calculate("100 10 /"), is(10));
    }

    @Test
    public void shouldModuloTwoNumbers() {
        assertThat(calculator.calculate("10 3 %"), is(1));
        assertThat(calculator.calculate("10 7 %"), is(3));
    }

    @Test
    public void shouldProcessInputWithMultipleOperations() {
        assertThat(calculator.calculate("2 1 0 + -"), is(1));
    }


}
