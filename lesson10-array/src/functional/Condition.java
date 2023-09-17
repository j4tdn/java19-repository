package functional;

@FunctionalInterface
//@FunctionalInterface: Đây là một chú thích (annotation) đặc biệt trong Java được sử dụng
//để chỉ định rằng giao diện hoặc lớp mà nó đính kèm là một giao diện chức năng. 
//Giao diện chức năng là một giao diện chỉ chứa một phương thức trừu tượng (abstract method), 
//được gọi là "phương thức chức năng" (functional method).
public interface Condition {
	boolean test(int number);
}
