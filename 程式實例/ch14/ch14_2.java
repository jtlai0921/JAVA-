class Dog {
	private String name;						// �ʪ��W�r
	Dog (String name) {							// �غc��k�]�w�W�r
		this.name = name;
	}
	public void eat( ) {						// ��keat
		System.out.println(name + "���b�Y����");	
	}
	public void sleep( ) {						// ��ksleep
		System.out.println(name + "���b��ı");
	}
	public void barking() {						// ��kbarking
		System.out.println(name + "���b�s");
	}
}
public class ch14_2 {
	public static void main(String[] args) {
		Dog dog = new Dog("Haly");
		dog.eat();
		dog.sleep();
		dog.barking();
	}
}

