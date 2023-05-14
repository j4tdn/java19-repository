package demo;

import java.lang.reflect.Method;

public class ReflectionDemo extends TestClass{
	
	static void testStatic() {
		System.out.println("=======CON=========");
	}
	
	public static void main(String[] args) throws Exception {
		TestClass tc = new TestClass();
		// tc.defaultMethod();
		// tc.privateMethod(); --> accessible
		
		
		Method method = TestClass.class.getDeclaredMethod("privateMethod");
		method.setAccessible(true);
		method.invoke(tc);
		
		ReflectionDemo.testStatic();
	}
}
