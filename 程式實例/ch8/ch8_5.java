class Dog {
	String name;		// �W�r
	String color;		// �C��
	int age;			// �~��
	void printInfo() {
		System.out.println("���W�r�O : " + name);
		System.out.println("���C��O : " + name);
		System.out.println("���~�֬O : " + age);
	}
}

public class ch8_5 {
	public static void main(String[] args) {
		Dog myDog = new Dog();		// �ŧi�P�إ�myDog����
		myDog.printInfo();
	}
}

