class Animal {
	String name = "Dog";
	int age = 5;
	@Override
	public String toString( ) {							// ���s�w�qtoString()
		return this.name + " ���~ " + this.age + " ��";
	}
}	
public class ch15_7 {
	public static void main(String[] args) {
		Animal animal = new Animal();
		System.out.println("�C�X���� : " + animal);  	// �ϥέ��s�w�q��toString()
	}
}

