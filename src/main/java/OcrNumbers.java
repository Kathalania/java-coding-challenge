import java.util.ArrayList;
import java.util.List;

public class OcrNumbers {
    private static final String[] NUMBER_PATTERNS = { // eventuell auslagern in Enum
            " _ " +
            "| |" +
            "|_|" +
            "   ", // 0

            "   " +
            "  |" +
            "  |" +
            "   ", // 1

            " _ " +
            " _|" +
            "|_ " +
            "   ", // 2

            " _ " +
            " _|" +
            " _|" +
            "   ", // 3

            "   " +
            "|_|" +
            "  |" +
            "   ", // 4

            " _ " +
            "|_ " +
            " _|" +
            "   ", // 5

            " _ " +
            "|_ " +
            "|_|" +
            "   ", // 6

            " _ " +
            "  |" +
            "  |" +
            "   ", // 7

            " _ " +
            "|_|" +
            "|_|" +
            "   ", // 8

            " _ " +
            "|_|" +
            " _|" +
            "   "  // 9
    };
    public static String Convert(String input) {
        input = input.replaceAll("\n", "");

        if (input.length() % 12 != 0){
            throw new IllegalArgumentException("Invalid length of input");
        }

        List<String> numbers = convertInputToNumbers(input);

        for (int i = 0; i < NUMBER_PATTERNS.length; i++) {
            if (input.equals(NUMBER_PATTERNS[i])) {
                return Integer.toString(i);
            }
        }

        return "?";
    }

    private static List<String> convertInputToNumbers(String input) {
        List<String> numbers = new ArrayList<>();

        for (int i = 0; i < input.length(); i += 12) {
            String number = input.substring(i, i + 12);
            numbers.add(number);
        }

        return numbers;
    }
}