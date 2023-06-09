package inheritance.multiple;

public class MultipleInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		child.playGame();
		child.codingSkills();
		System.out.println("x" + child.lenght);

		
		Father f = new Father();
		System.out.println("x" + f.lenght);

	}

}
