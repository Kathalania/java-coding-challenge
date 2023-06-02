import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    private static final Map<String, Integer> NUMBER_MAP = createNumberMap();

    public static String Convert(String input) {
        input = input.replaceAll("\n", "");

        if (input.length() % 12 != 0){
            throw new IllegalArgumentException("Invalid length of input");
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < input.length(); i += 12) {
            String number = input.substring(i, i + 12);
            Integer numericValue = NUMBER_MAP.getOrDefault(number, -1);
            if (numericValue != -1) {
                stringBuilder.append(numericValue);
            } else {
                stringBuilder.append("?");
            }
        }

        return stringBuilder.toString();
    }

    private static Map<String, Integer> createNumberMap() {
        Map<String, Integer> numberMap = new HashMap<>();
        for (int i = 0; i < NUMBER_PATTERNS.length; i++) {
            numberMap.put(NUMBER_PATTERNS[i], i);
        }
        return numberMap;
    }
}