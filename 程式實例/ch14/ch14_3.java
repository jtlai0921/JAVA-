class Bird {
	private String name;						// �ʪ��W�r
	Bird (String name) {						// �غc��k�]�w�W�r
		this.name = name;
	}
	public void eat( ) {						// ��keat
		System.out.println(name + "���b�Y����");	
	}
	public void sleep( ) {						// ��ksleep
		System.out.println(name + "���b��ı");
	}
	public void flying() {						// ��kfly
		System.out.println(name + "���b��");
	}
}
public class ch14_3 {
	public static void main(String[] args) {
		Bird bird = new Bird("Cici");
		bird.eat();
		bird.sleep();
		bird.flying();
	}
}

