package bean;

public class Transaction {
	private Trader trader;
    private int year;
    private long value;

    public Transaction(Trader trader, int year, long value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }

    public Trader getTrader() {
        return trader;
    }

    public int getYear() {
        return year;
    }

    public long getValue() {
        return value;
    }
}
