package builder;
/*/
 * Ly thuyet:
 * Builder pattern la ky thuat de khoi tao nhung doi tuong phuc tap
 * + Doi tuong co rat nhieu thuoc tinh >=5
 * 
 * --> giup minh thay vi goi ham khoi tao ham nhieu tham so, de nham lan
 * khi gan gia tri cho thuoc tinh
 * --> giup minh thay the phan setter gon hon
 * --> chi khoi tao builder cho instance 1 lan ban dau
 * --> muon set lai gia tri --> khong duoc
 * 
 * +Thuc thi
 * --> Su dung 1 nested builder class de tao ra instance cho current class
 *  . builder: khoi tao doi tuong, set gia tri vao
 *  . Class: luu tru, su dung gia tri
 */
public class BuilderDemo {
    public static void main(String[] args) {
    	Java20DateTime dt20 = Java20DateTime.of()
	               .withDay(20)
	               .withMoth(12)
	               .withYear(2022)
	               .withHour(10)
	               .withMinute(12);
      dt20.withMinute(50);
      
      System.out.println("dt20" +dt20);
	}
	
}
