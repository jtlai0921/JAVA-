class Animal {
	private String name;						// �ʪ��W�r
	Animal(String name) {						// �غc��k�]�w�W�r
		this.name = name;
	}
	public void eat( ) {						// ��keat
		System.out.println(name + "���b�Y����");
	}
	public void sleep( ) {						// ��ksleep
		System.out.println(name + "���b��ı");
	}
}
public class ch14_1 {
	public static void main(String[] args) {
		Animal animal = new Animal("Lily");
		animal.eat();
		animal.sleep();
	}
}

