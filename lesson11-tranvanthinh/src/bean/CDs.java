package bean;

import java.util.Comparator;
import java.util.List;

public class CDs {
	private List<CD> CDs;
	private int size;

	public CDs(List<CD> cDs) {
		CDs = cDs;
		size = cDs.size();
	}

	public List<CD> getCDs() {
		return CDs;
	}

	public void setCDs(List<CD> cDs) {
		CDs = cDs;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public void addCD(CD cD) {
		for (CD cd : CDs) {
			if (cd.equals(cD)){
				System.out.println("The id existed");
				return;
			}
		}
		CDs.add(cD);
		setSize(getSize() + 1);
	}
	
	public void sortDESCByPrice() {
		
		CDs.sort(Comparator.comparing(CD::getPrice, Comparator.reverseOrder()));
	}
	
	public void sortASCById() {
		CDs.sort(Comparator.comparing(CD::getId));
	}
}
