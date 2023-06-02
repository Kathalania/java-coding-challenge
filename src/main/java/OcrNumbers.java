public class OcrNumbers
{
    public static String Convert(String input) {
        if (input.length() != 12){
            throw new IllegalArgumentException("Invalid length of input");
        }
        if (input.equals(" _ " +
                         "| |" +
                         "|_|" +
                         "   ")){
            return "0";
        }
        return "?";
    }
}