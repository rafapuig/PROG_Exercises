package strings;

import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;

public class CheckSameDigits {

    public static boolean checkSameDigits(int number) {

        String numberString = String.valueOf(number);
        //String numberString2 = Integer.toString(number, 10);

        if (numberString.length() < 2) return true;

        char firstDigit = numberString.charAt(0);


        for (int i = 1; i < numberString.length(); i++) {
            if (numberString.charAt(i) != firstDigit) return false;
        }

        return true;
    }


    public static boolean checkSameDigits_v1(int number) {

        String numberString = String.valueOf(number);

        if (numberString.length() < 2) return true;

        char firstDigit = numberString.charAt(0);

        return IntStream
                .range(1, numberString.length())
                .allMatch(num -> numberString.charAt(num) == firstDigit);
    }


    public static boolean checkSameDigits_v2(int number) {

        String numberString = String.valueOf(number);

        if (numberString.length() < 2) return true;

        char firstDigit = numberString.charAt(0);

        return numberString.chars()
                .skip(1)
                .allMatch(c -> c == firstDigit);
    }

    public static void main(String[] args) {

        List<Function<Integer,Boolean>> functions = List.of(
                CheckSameDigits::checkSameDigits,
                CheckSameDigits::checkSameDigits_v1,
                CheckSameDigits::checkSameDigits_v2);

        int number = 22222;
        testCheckSameDigits(number, CheckSameDigits::checkSameDigits);
        testCheckSameDigits(number, CheckSameDigits::checkSameDigits_v1);
        testCheckSameDigits(number, CheckSameDigits::checkSameDigits_v2);

        number = 22322;
        testCheckSameDigits(number, CheckSameDigits::checkSameDigits);
        testCheckSameDigits(number, CheckSameDigits::checkSameDigits_v1);
        testCheckSameDigits(number, CheckSameDigits::checkSameDigits_v2);

        number = 5555555;
        for (Function<Integer,Boolean> checkSameDigitsFunction : functions) {
            testCheckSameDigits(number, checkSameDigitsFunction);
        }

    }

    static void testCheckSameDigits(int number, Function<Integer, Boolean> checkSameDigits) {
        boolean result = checkSameDigits.apply(number);
        System.out.println("Los digitos de " + number + (result ? " " : "no ") + "son iguales");
    }

}
