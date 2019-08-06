package za.co.assessment.calculator.model;

public class Operation {

    private FirstOperand firstOperand;
    private SecondOperand secondOperand;
    private Operator operator;

    public Operation(FirstOperand firstOperand, SecondOperand secondOperand, Operator operator) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
        this.operator = operator;
    }

    public int operate() {
        int result = 0;

        if ("+".equalsIgnoreCase(this.operator.getValue())) {
            result = this.firstOperand.getValue() + this.secondOperand.getValue();
        }

        if ("-".equalsIgnoreCase(this.operator.getValue())) {
            result = this.firstOperand.getValue() - this.secondOperand.getValue();
        }

        if ("x".equalsIgnoreCase(this.operator.getValue())) {
            result = this.firstOperand.getValue() * this.secondOperand.getValue();
        }

        if ("/".equalsIgnoreCase(this.operator.getValue())) {
            result = this.firstOperand.getValue() / this.secondOperand.getValue();
        }

        if ("%".equalsIgnoreCase(this.operator.getValue())) {
            result = this.firstOperand.getValue() % this.secondOperand.getValue();
        }

        return result;
    }
}
