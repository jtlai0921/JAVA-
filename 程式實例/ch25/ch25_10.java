@FunctionalInterface						// �o�O�ﶵoptional
interface Message {							// �w�q��H���O
	void msg();
}
class Test {
	public static void talking() {
		System.out.println("�o�Ostatic method");
	}
}
public class ch25_10 {
	public static void main(String[] args) {
		Message obj = (Test::talking);		// ��k�ѷ�
		obj.msg();
	}
}

