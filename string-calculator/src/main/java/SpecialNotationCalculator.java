public class SpecialNotationCalculator {

    public int calculate(String specialNotation) {

        String[] split = specialNotation.split("\\s");
        for (String s : split) {
            if ("+".equalsIgnoreCase(s)) {
                return Integer.valueOf(split[0]) + Integer.valueOf(split[1]);
            }

            if ("-".equalsIgnoreCase(s)) {
                return Integer.valueOf(split[0]) - Integer.valueOf(split[1]);
            }

        }

        return 0;

    }
}
