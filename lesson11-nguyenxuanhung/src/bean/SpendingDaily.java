package bean;

import java.util.Objects;

public class SpendingDaily {
	public String spendingName;
	public Integer value;
	public SpendingDaily() {
	}
	public SpendingDaily(String spendingName, Integer value) {
		super();
		this.spendingName = spendingName;
		this.value = value;
	}
	public String getSpendingName() {
		return spendingName;
	}
	public void setSpendingName(String spendingName) {
		this.spendingName = spendingName;
	}
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "SpendingDaily [spendingName=" + spendingName + ", value=" + value + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(spendingName, value);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SpendingDaily other = (SpendingDaily) obj;
		return Objects.equals(spendingName, other.spendingName) && Objects.equals(value, other.value);
	}
	
}
