import java.util.ArrayList;
import java.util.List;

public class StringManipulations {
    public static void main(String[] args) {
        String str = "test";
        str = "test" + "string";
        System.out.println("String length: " + str.length());
        System.out.println("String to upper: " + str.toUpperCase());

        System.out.println("Sub string: " + str.substring(4, 10));
        System.out.println("Sub string: " + str.substring(4));
        System.out.println("Character at index 0: " + str.charAt(0));
        System.out.println("Character at last index: " + str.charAt(str.length() - 1));

        System.out.println("String contains test: " + str.contains("test"));
        System.out.println("String contains Test: " + str.contains("Test"));
        System.out.println("String contains Test: " + str.toUpperCase().contains("Test".toUpperCase()));

        System.out.println("String starts with test: " + str.startsWith("test"));
        System.out.println("String ends with string: " + str.endsWith("string"));

        String data = "AAPL,MSFT,GOOG,TSLA";
        String[] tickers = data.split(",");
        for (String ticker : tickers) {
            System.out.println("Ticker: " + ticker);
        }
    }
}
