@FunctionalInterface						// �o�O�ﶵoptional
interface Message {							// �w�q��H���O
	void msg();
}
class Test {
	public void talking() {
		System.out.println("�o���Ostatic method");
	}
}
public class ch25_12 {
	public static void main(String[] args) {
		Test obj = new Test();
		Message msgObj = obj::talking;		// ��k�ѷ�
		msgObj.msg();
	}
}

