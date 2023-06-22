package ex03;

/*/
 * Cho dãy kí tự chứa các kí tự thường và khoảng trắng.
Viết chương trình loại bỏ khoảng trắng thừa và đảo chuỗi như sau:
Example: input: Welcome to JAVA10 class
output: emocleW ot 01AVAJ ssalc
 */
public class Ex03String {
	public static void main(String[] args) {
		String input = "Welcome  to  JAVA10   class";
		String output = input.replaceAll("\\s+", " ");
		System.out.println("New string: " + output);

		StringBuffer bf = new StringBuffer(output);
		System.out.println("Reversed string: " + bf.reverse());

	}
}
