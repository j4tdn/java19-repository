package ex04;

import java.util.Arrays;

public class SaddleElementAttribute {
	private int m;
	private int n;
	private int[] A = new int[m * n];

	public SaddleElementAttribute() {
	}

	public SaddleElementAttribute(int m, int n, int[] a) {
		this.m = m;
		this.n = n;
		A = a;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int[] getA() {
		return A;
	}

	public void setA(int[] a) {
		A = a;
	}

	@Override
	public String toString() {
		return "SaddleElementAttribute [m=" + m + ", n=" + n + ", A=" + Arrays.toString(A) + "]";
	}

}
