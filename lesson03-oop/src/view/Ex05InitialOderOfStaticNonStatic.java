package view;

public class Ex05InitialOderOfStaticNonStatic {
	// initial time: static.. --> non-static...
	
		static int staticVariable1;
		static int staticVariable2;
		
		int nonStaticVariable3;
		int nonStaticVariable4;

		static void staticMethod1() {
			
		}

		static void staticMethod2() {
			staticMethod1();
			// nonStaticMethod3();
			
			// static --> static --> ok
			// non    --> non    --> ok
			// static --> non    --> no
			// non    --> static --> ok
			
			// Khi lấy tên class . staticMethod2() 
			// thì ko biết đối tượng nào đang gọi nonStaticMethod3()
			// Lúc này nonStaticMethod3 chưa được khởi tạo
		}

		void nonStaticMethod3() {

		}

		void nonStaticMethod4() {
			staticMethod1();
			nonStaticMethod3();
		}
}
