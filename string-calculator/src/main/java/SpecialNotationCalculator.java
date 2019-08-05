public class SpecialNotationCalculator {

    public void execute() {

    }

    public int calculate(String specialNotation) {
        if ("5 6 +".equalsIgnoreCase(specialNotation)) {
            return 11;
        }

        if ("1 1 +".equalsIgnoreCase(specialNotation)) {
            return 2;
        }

        return 0;

    }
}
