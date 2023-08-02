import java.util.HashMap;
import java.util.Map;

public class Main {

    private static final Map<Integer, String> hundredsNames = new HashMap<>();
    private static final Map<Integer, String> tensNames = new HashMap<>();
    private static final Map<Integer, String> onesNames = new HashMap<>();

    static {
        hundredsNames.put(1, "one");
        hundredsNames.put(2, "two");
        hundredsNames.put(3, "three");
        hundredsNames.put(4, "four");
        hundredsNames.put(5, "five");
        hundredsNames.put(6, "six");
        hundredsNames.put(7, "seven");
        hundredsNames.put(8, "eight");
        hundredsNames.put(9, "nine");

        tensNames.put(1, "ten");
        tensNames.put(2, "twenty");
        tensNames.put(3, "thirty");
        tensNames.put(4, "forty");
        tensNames.put(5, "fifty");
        tensNames.put(6, "sixty");
        tensNames.put(7, "seventy");
        tensNames.put(8, "eighty");
        tensNames.put(9, "ninety");

        onesNames.put(0, "");
        onesNames.put(1, "one");
        onesNames.put(2, "two");
        onesNames.put(3, "three");
        onesNames.put(4, "four");
        onesNames.put(5, "five");
        onesNames.put(6, "six");
        onesNames.put(7, "seven");
        onesNames.put(8, "eight");
        onesNames.put(9, "nine");
    }

    public static String readNumber(int number) {
        String numberStr = String.valueOf(number);
        int length = numberStr.length();
        String reading = "";

        for (int i = 0; i < length; i++) {
            int digit = numberStr.charAt(i) - '0';

            if (i == 0 && digit != 0) {
                reading += hundredsNames.get(digit);
            } else if (i == 1 && length > 2 && digit != 0) {
                reading += " " + tensNames.get(digit);
            } else if (i == 2 && length > 2 && digit != 0) {
                reading += " " + onesNames.get(digit);
            }
        }

        if (reading.equals("")) {
            reading = "zero";
        }

        return reading;
    }

    public static void main(String[] args) {
        System.out.println(readNumber(180));
    }
}