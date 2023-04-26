package polymorphism.method;

public class Ex02OverridingDemo {
	
	private int value = 99;
	
	
    public static void main(String[] args) {
		Ex02OverridingDemo demo = new Ex02OverridingDemo();
		System.out.println("demo --> " + demo);
	}
    @Override
    public String toString() {
    	return String.valueOf(value);
    }
    
}
