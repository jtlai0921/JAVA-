class Animal {
	String name = "Dog";
	int age = 5;
}	
public class ch15_4 {
	public static void main(String[] args) {
		Animal A = new Animal();
		Animal B = new Animal();
		Animal C = B;
		System.out.println("A = B : " + A.equals(B));  	// �ϥ�Object��equals
		System.out.println("A = C : " + A.equals(C));	// �ϥ�Object��equals
		System.out.println("B = C : " + B.equals(C));	// �ϥ�Object��equals
	}
}

