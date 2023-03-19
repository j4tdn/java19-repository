package view;

public class Ex05InitialOrderOfStaticNonStatic {
	// initial time : static --> non static

	static int staticvariable1;
	static int staticvariable2;

	int nonstaticvariable3;
	int nonstaticvariable4;

	static void staticMethod1() {

	}

	static void staticMethod2() {
		staticMethod1();
		// nonstaticMethod3();
		// --> lỗi

		// static --> static --> ok
		// non --> non --> ok
		// static --> non --> NOK
		// non --> static --> ok

	}

	void nonstaticMethod3() {
		staticMethod1();
		nonstaticMethod4();
	}

	void nonstaticMethod4() {

	}

}
