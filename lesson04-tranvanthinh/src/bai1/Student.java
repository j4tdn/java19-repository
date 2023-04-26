package bai1;

import java.util.Arrays;

public class Student {
	private int mssv;
	private String name;
	private float theoryScore;
	private float practiceScore;
	
	public Student() {
	}

	public Student(int mssv, String name, float theoryScore, float practiceScore) {
		super();
		this.mssv = mssv;
		this.name = name;
		this.theoryScore = theoryScore;
		this.practiceScore = practiceScore;
	}

	public float avgScore() {
		return (this.practiceScore + this.theoryScore)/2;
	}
	
	public int getMssv() {
		return mssv;
	}

	public void setMssv(int mssv) {
		this.mssv = mssv;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getTheoryScore() {
		return theoryScore;
	}

	public void setTheoryScore(float theoryScore) {
		this.theoryScore = theoryScore;
	}

	public float getPracticeScore() {
		return practiceScore;
	}

	public void setPracticeScore(float practiceScore) {
		this.practiceScore = practiceScore;
	}

	@Override
	public String toString() {
		return "Student [mssv=" + mssv + ", name=" + name + ", theoryScore=" + theoryScore
				+ ", practiceScore=" + practiceScore + "]";
	}
	
	
	
}
