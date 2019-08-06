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
            //create operation #1
            FirstOperand firstOperand = new FirstOperand(1);
            SecondOperand secondOperand = new SecondOperand(0);
            Operator operator = new Operator("-");
            Operation operation = new Operation(firstOperand, secondOperand, operator);
            //result of first operation now becomes second operand for new operation
            secondOperand = new SecondOperand(operation.operate());
            firstOperand = new FirstOperand(2);
            //create operation #2
            operation = new Operation(firstOperand, secondOperand, new Operator("-"));
            return operation.operate();
        }
        return 0;
    }
}
