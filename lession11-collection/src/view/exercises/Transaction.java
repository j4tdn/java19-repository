package view.exercises;

public class Transaction {
	private Trader trader;
	private Integer year;
	private Long value;
	public Trader getTrader() {
		return trader;
	}
	public void setTrader(Trader trader) {
		this.trader = trader;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Long getValue() {
		return value;
	}
	public void setValue(Long value) {
		this.value = value;
	}
	public Transaction(Trader trader, Integer year, Long value) {
		this.trader = trader;
		this.year = year;
		this.value = value;
	}
	public Transaction() {
	}
	@Override
	public String toString() {
		return "Transaction [trader=" + trader + ", year=" + year + ", value=" + value + "]";
	}
}
