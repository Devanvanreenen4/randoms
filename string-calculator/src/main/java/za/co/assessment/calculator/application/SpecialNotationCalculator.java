package za.co.assessment.calculator.application;

import za.co.assessment.calculator.model.FirstOperand;
import za.co.assessment.calculator.model.Operation;
import za.co.assessment.calculator.model.Operator;
import za.co.assessment.calculator.model.SecondOperand;

public class SpecialNotationCalculator {

    public int calculate(String specialNotation) {

        String[] split = specialNotation.split("\\s");
        FirstOperand firstOperand = new FirstOperand(Integer.valueOf(split[0]));
        SecondOperand secondOperand = new SecondOperand(Integer.valueOf(split[1]));
        Operator operator = new Operator(split[2]);
        Operation operation = new Operation(firstOperand, secondOperand, operator);
        return operation.operate();

    }
}
