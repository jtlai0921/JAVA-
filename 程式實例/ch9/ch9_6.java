class MyClass {
	int age;									// �~��
	String name;								// �m�W
	MyClass(int a) {							// �غc��k�ѼƬO�@�Ӿ��	
		age = a; 								// �]�w�~��
	}
	MyClass(String str) {						// �غc��k�ѼƬO�@�Ӧr��
		name = str;								// �]�w�m�W
	}
	MyClass(int a, String str) {				// �غc��k�ѼƬO�@�Ӿ�ƩM�r��
		age = a;								// �]�w�~��
		name = str;								// �]�w�m�W
	}
	void printInfo() {							// �C�L�����ܼ�
		System.out.println(name);				// �C�L�m�W
		System.out.println(age);				// �C�L�~��
	}
}
public class ch9_6 {
	public static void main(String[] args) {
		MyClass A = new MyClass(20);
		A.printInfo();
		MyClass B = new MyClass("John");
		B.printInfo();
		MyClass C = new MyClass(25, "Lin");
		C.printInfo();
	}
}
 
