public class NumberRegexChecker {

    public static final String REGEX_NUMERIC = "^-?\\d+(\\.\\d+)?$";

    public static void main(String[] args) {
        String input = "-12345";
        String input2 = "-1.2345";
        String input3 = "-12.345";
        String input4 = "=1234.5";
        String input5 = "112345";
        System.out.println(input.matches(REGEX_NUMERIC));
        System.out.println(input2.matches(REGEX_NUMERIC));
        System.out.println(input3.matches(REGEX_NUMERIC));
        System.out.println(input4.matches(REGEX_NUMERIC));
        System.out.println(input5.matches(REGEX_NUMERIC));
    }
}
