interface Animal {						// �w�qAnimal����
	void showMe();						// ��HshowMe��k
}
interface Bird extends Animal {			// �w�qInterface�����~��Animal
	void flying(); 						// ��Hflying��k
}
class Eagle implements Bird {			// �w�qEagle���O��@Birds
	public void showMe() {				// ��@showMe��k
		System.out.println("�ڬO�ʪ�");	
	}
	public void flying() {				// ��@flying��k
		System.out.println("�ڬO���N�ڷ|��");	
	}
}
public class ch17_9 {
	public static void main(String[] args) {
		Eagle eagle = new Eagle();		// �إ�eagle����
		eagle.showMe();
		eagle.flying();
	}
}

