class Person {
	public static int age;						// �Ҧ�����@�ɦ������
	public String name;							// �C�@�Ӫ��󦳤@�������
	public void output() {
		System.out.println("Name: " + name);
		System.out.println("Age:  " + age);
	}
}

public class ch9_17 {
	public static void main(String[] args) {
		Person P1 = new Person();
		P1.name = "Peter";
		P1.age = 20;
		Person P2 = new Person();
		P2.name = "John";
		P2.age = 30;
		P1.output();
		P2.output();
	}
}
 
