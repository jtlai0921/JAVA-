interface Bird {						// �w�qBird����
	void showMe();						// ��HshowMe��k
	default void action() {				// Default��k
		System.out.println("�ڷ|��");
	}
	
}
class Eagle implements Bird {			// �w�qEagle���O��@Bird
	public void showMe() {				// ���s�w�qshowMe��k
		System.out.println("�ڬO��");	
	}
}
public class ch17_3 {
	public static void main(String[] args) {
		Eagle eagle = new Eagle();		// �إ�eagle����
		eagle.showMe();
		eagle.action();
	}
}

