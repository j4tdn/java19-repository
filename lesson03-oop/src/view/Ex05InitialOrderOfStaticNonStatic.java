package view;

public class Ex05InitialOrderOfStaticNonStatic {
	
	static  int staticVariable1;
	static  int staticVariable2;
	
	int nonStaticVariable3;
	int nonStaticVariable4;
	
	
	static void staticMethod1() {
		
	}
	
	//static call static : ok
	//non-static call non-static : ok
	
	//static call non-static : no
	//non-static call static : ok
	
	static void staticMethod2() {
		staticMethod1();
//		nonStaticMethod3();
		//classname.staticMethod2()
		//thi ko biet object nao dang goi nonStaticMethod3()
	}
	
	void nonStaticMethod3() {
		
	}
	
	void nonStaticMethod4() {
		staticMethod1();
		nonStaticMethod3();
	}
}
