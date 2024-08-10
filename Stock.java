import java.math.BigDecimal;
import java.util.Objects;

public class Stock {
    private String tickerSymbol;
    private String tickerName;
    private String tickerID;
    private int marketCap;

    private int sectorId;
    private int subSectorId;

    public Stock(String tickerSymbol,
                 String tickerName,
                 int marketCap,
                 ) {
        this.tickerSymbol = tickerSymbol;
        this.tickerName = tickerName;
        this.marketCap = marketCap;
    }

    boolean hasGoodFundamentals() {
        boolean bool = this.currentRatio > 10;
        return bool;
    }

    void print() {
        System.out.println("Ticker Symbol: " + tickerSymbol);
        System.out.println("Ticker Name: " + tickerName);
        System.out.println("Market Cap: " + marketCap);
        System.out.println("Sector Id: " + sectorId);
        System.out.println("Subsector Id: " + subSectorId);
    }

}
