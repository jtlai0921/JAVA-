class MyClass {
	int age;									// �~��
	String name;								// �m�W
	MyClass(int age) {							// �غc��k�ѼƬO�@�Ӿ��	
		this.age = age; 						// �]�w�~��
	}
	MyClass(String name) {						// �غc��k�ѼƬO�@�Ӧr��
		this.name = name;						// �]�w�m�W
	}
	MyClass(int age, String name) {				// �غc��k�ѼƬO�@�Ӿ�ƩM�r��
		this.age = age;							// �]�w�~��
		this.name = name;						// �]�w�m�W
	}
	void printInfo() {							// �C�L�����ܼ�
		System.out.println(name);				// �C�L�m�W
		System.out.println(age);				// �C�L�~��
	}
}
public class ch9_9 {
	public static void main(String[] args) {
		MyClass A = new MyClass(20);
		A.printInfo();
		MyClass B = new MyClass("John");
		B.printInfo();
		MyClass C = new MyClass(25, "Lin");
		C.printInfo();
	}
}
 
