class Person {
	public static int age;						// �Ҧ�����@�ɦ������
	public String name;							// �C�@�Ӫ��󦳤@�������
	public Person(String name) {
		this.name = name;
	}
	public void output() {
		System.out.println("Name: " + name);
		System.out.println("Age:  " + age);
	}
}

public class ch9_18 {
	public static void main(String[] args) {
		Person.age = 20;						// �i�H�b�ŧi����e�]�wage
		Person P1 = new Person("Peter");
		Person P2 = new Person("John");
		P1.output();
		P2.output();
		Person.age = 30;						// �]�i�H�b�ŧi�����]�wage
		P1.output();
		P2.output();
	}
}
 
