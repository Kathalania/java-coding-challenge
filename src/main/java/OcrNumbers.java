public class OcrNumbers {
    private static final String[] NUMBER_PATTERNS = {
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

        for (int i = 0; i < NUMBER_PATTERNS.length; i++) {
            if (input.equals(NUMBER_PATTERNS[i])) {
                return Integer.toString(i);
            }
        }

        return "?";
    }
}