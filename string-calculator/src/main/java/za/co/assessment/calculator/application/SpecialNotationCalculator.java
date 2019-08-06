package za.co.assessment.calculator.application;

import za.co.assessment.calculator.model.FirstOperand;
import za.co.assessment.calculator.model.Operation;
import za.co.assessment.calculator.model.Operator;
import za.co.assessment.calculator.model.SecondOperand;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
            return processMultipleOperations(specialNotation);
        }
    }

    private int processMultipleOperations(String specialNotation) {
        String pattern = "\\d\\s\\d\\s\\D";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(specialNotation);
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            m.appendReplacement(sb, m.group(0).replaceFirst(Pattern.quote(m.group(0)), String.valueOf(calculate(m.group(0)))));
        }
        m.appendTail(sb);
        return calculate(sb.toString());
    }


}
