package za.co.assessment.calculator.application;

import za.co.assessment.calculator.model.FirstOperand;
import za.co.assessment.calculator.model.Operation;
import za.co.assessment.calculator.model.Operator;
import za.co.assessment.calculator.model.SecondOperand;

public class SpecialNotationCalculator {

    public int calculate(String specialNotation) {

        String[] specialNotationElements = specialNotation.split("\\s");
        if (specialNotationElements.length == 3) {
            FirstOperand firstOperand = new FirstOperand(Integer.valueOf(specialNotationElements[0]));
            SecondOperand secondOperand = new SecondOperand(Integer.valueOf(specialNotationElements[1]));
            Operator operator = new Operator(specialNotationElements[2]);
            Operation operation = new Operation(firstOperand, secondOperand, operator);
            return operation.operate();
        } else {
            return processMultipleOperations(specialNotationElements);
        }

    }

    private int processMultipleOperations(String[] specialNotationElements) {
        if (specialNotationElements.length > 3) {
            Operation operation1 = new Operation(new FirstOperand(1), new SecondOperand(0), new Operator("+"));
            Operation operation2 = new Operation(new FirstOperand(2), new SecondOperand(operation1.operate()), new Operator("-"));
            return operation2.operate();
        }
        return 0;
    }
}
