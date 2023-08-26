package view.knowledge;


public class Ex99ReviewFunctionalInterface {
	 public static void main(String[] args) {
		 
		TestFunctionalInterface<Integer, Integer, Integer> t = new TestFunctionalInterface<Integer, Integer, Integer>() {
			
			@Override
			public Integer apply(Integer u, Integer v) {
				return u+v;
			}
		};
		
		TestFunctionalInterface<Integer, Integer, Integer> t2 = (u,v) -> u+v;
		
		System.out.println(t.apply(2, 3));
		System.out.println(t2.apply(2, 3));
		
		
		
		
	}
}
