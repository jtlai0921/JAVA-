@FunctionalInterface						// �o�O�ﶵoptional
interface Message {							// �w�q��H���O
	Test getMsg(String msg);
}
class Test {
	Test(String msg) {
		System.out.println(msg);
	}
}
public class ch25_13 {
	public static void main(String[] args) {
		Message msgObj = Test::new;			// ��k�ѷ�
		msgObj.getMsg("Constructor");
	}
}

