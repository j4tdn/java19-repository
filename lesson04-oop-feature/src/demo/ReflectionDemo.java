package demo;

public class ReflectionDemo {
public static void main(String[] args) {
	TestClass tc = new TestClass();
	//tc.defaultMethod();
	//tc.privateMethod();
	
	Method methods = TestClass.class.getDeclaredMethods("privateMethod");
	
}
}
