public class OcrNumbers
{
    public static String Convert(String input) {
        input = input.replaceAll("\n", "");

        if (input.length() % 12 != 0){
            throw new IllegalArgumentException("Invalid length of input");
        }
        if (input.equals(" _ " +
                         "| |" +
                         "|_|" +
                         "   ")){
            return "0";
        }
        if (input.equals("   " +
                         "  |" +
                         "  |" +
                         "   ")) {
            return "1";
        }

        return "?";
    }
}