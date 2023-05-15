package view;
/**
 * 
 * @author Admin
 *obj of a 1st degree equation ax+b=0
 */
public class Equation1st {
private double a;
private double b;

public Equation1st() {
	// TODO Auto-generated constructor stub
}

public Equation1st(double a, double b) {
	this.a = a;
	this.b = b;
}

public double getA() {
	return a;
}

public void setA(double a) {
	this.a = a;
}

public double getB() {
	return b;
}

public void setB(double b) {
	this.b = b;
}

@Override
public String toString() {
	return "Equation " + a + "x + " + b + " = 0";
}


}
