package view.knowledge;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Comparator;
import java.util.concurrent.Callable;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ex01LamdaExp_Example {
	/*
	 
	 Item --> Tạo ra đối tượng cho class Item --> Item item = new Item() --> KDL Item
	 Employee --> Tạo ra đối tượng cho class Employee --> KDL Employee
	 
	 Lambda: Là cách viết ngắn gọn để khởi tạo ra 1 đối tượng/thể hiện của function interface
	         để override abstract method trong functional interface, thay vì phải tạo class mới để impl
	         functional interface hoặc dùng anonymous class
	         
	       : Có 3 phần
	         (parameters) -> {
	             body method
	         }
	         1. danh sách tham số
	         2. ->
	         3. phần thực thi
	            --> chính là đoạn code, hàm, chức năng muốn override cho hàm trừu tượng trong functional interface
	            --> nội dung thế nào là do logic mình muốn override
	       	 4. cách làm ngắn gọn
	       	    1. danh sách tham số: 
	       	       --> ko cần ghi KDL, cần ghi tên biến(bất kỳ)
	       	       --> nếu chỉ có 1 tham số, có thể xóa luôn ()
	       	    2. -> luôn luôn có
	       	    3. phần thực thi
	       	       --> nếu body chỉ có 1 dòng, có thể xóa luôn {}
	       	       -->                         cần return data thì chỉ cần ghi giá trị trả về, k cần ghi chữ return
	       
	       : kiểu dữ liệu trả về là kiểu Functional Interface
	         Ví dụ:
	                ApplePridcate<Apple> a = (Apple apple) -> 'green'.equals(a.getColor())
    	            Consumer<Apple> c = (Apple apple) -> System.out.println(apple)
    	            
	 
	 */
	

	public static void main(String[] args) {
		// Một vài functional interface được tạo sẵn trong JAVA
		
				// --> Runnable #abstract-method# --> void run();
				
				Runnable r1 = new Runnable() {
					
					@Override
					public void run() {
						System.out.println("Hello R1");
					}
				};
				
				Runnable r2 = () -> {
					System.out.println("Hello R1");
				};
				
				Runnable r3 = () -> System.out.println("Hello R1");
				
				Runnable r4 = () -> {
					int a = 5 + 7;
					System.out.println("a --> " + a);
				};
				
				// --> Comparator<T> #abstract-method# --> int compare(T o1, T o2);
				
				Comparator<String> c1 = new Comparator<String>() {

					@Override
					public int compare(String s1, String s2) {
						return s1.compareTo(s2);
					}
					
				};
				
				Comparator<String> c2 = (String s1, String s2) -> {
					return s1.compareTo(s2);
				};
				
				Comparator<String> c3 = (s1, s2) -> {
					return s1.compareTo(s2);
				};
				
				Comparator<String> c4 = (s1, s2) -> s1.compareTo(s2);
				
				// --> Function<T, R> #abstract-method# --> R apply(T t);
				// đã từng dùng ở mapping lesson11
				Function<String, Integer> f1 = new Function<>() {

					@Override
					public Integer apply(String s) {
						return s.length();
					}
				};
				
				Function<String, Integer> f2 = s -> s.length();
				
				// --> Callable<V>  #abstract-method# --> V call()
				
				Callable<BigDecimal> call1 = new Callable<BigDecimal>() {

					@Override
					public BigDecimal call() throws Exception {
						return BigDecimal.valueOf(100);
					}
					
				}; 
				
				Callable<BigDecimal> call2 = () -> BigDecimal.valueOf(100);
				
				
				// Supplier<T> #abstract-method# --> T get();
				Supplier<BigDecimal> s1 = new Supplier<BigDecimal>() {
					
					@Override
					public BigDecimal get() {
						return BigDecimal.valueOf(300);
					}
				};
				
				Supplier<BigDecimal> s2 = () -> BigDecimal.valueOf(300);
				
				/*
				 Với KDL bình thường, kiểu nguyên thủy hoặc kiểu đối tượng để biết được KDL của biến là gì
				          thì mình sẽ dựa vào KDL khai báo bên trái lúc compile và bên phải lúc runtime
				    VD: Item item = new Item();
				        Item item = new TraditionalItem();
				        Item item = new ModernItem();
				        
				        --> Dựa vào KDL khai báo bên trái để biết lúc compile nó là KDL gì
				        --> Và phần assignment(gán) bên phải đến biết nó là KDL gì lúc runtime
				      
				 Với KDL funtional interface
				    VD: .... = () -> new Employee(); --> chưa biết lúc runtime nó là KDL gì
				                                         để biết được dựa vào KDL bên trái nó khai báo
				        Callable<Employee> c = () -> new Employee();
				        Supplier<Employee> s = () -> new Employee();
				        
				        .... = (Employee e) -> e.getId(); --> có chắc chắn 100% là Function<T, R> ? KHÔNG
				                                                                   Func<X, Y>
				                                                                   
				        --> type inference: muốn biết được VP mang KDL trả về là gì thì phải dựa vào KDL khai báo bên trái
				 */
				
				// Predicate<T> #abstract-method# --> boolean test(T t);
				// đã từng dùng ở hàm filter lesson11
				Predicate<String> p1 = new Predicate<String>() {
					@Override
					public boolean test(String s) {
						return s.length() > 10 && s.startsWith("SHD");
					}
				};
				
				Predicate<String> p2 = s -> s.length() > 10 && s.startsWith("SHD");
				
				// Consumer<T>,  #abstract-method# --> void accept(T t);
				// đã từng dùng ở forEach lesson11
				Consumer<String> con1 = new Consumer<String>() {
					@Override
					public void accept(String s) {
						System.out.println("s --> " + s);
					}
				};
				
				Consumer<String> con2 = s -> System.out.println("s --> " + s);
				
				
				// Test
				
				// BiFunction<T, U, R> --> R apply(T t, U u);
				// BinaryOperator<T> --> T apply(T t1, T t2);
				
				BiFunction<String, String, String> bf1 = (String st1, String st2) -> st1.concat(st2);
				
				BinaryOperator<String> bo1 = (String st1, String st2) -> st1.concat(st2);
			}
		}
