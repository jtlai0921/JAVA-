@FunctionalInterface						// �o�O�ﶵoptional
interface Shapes {							// �w�q��H���O
	public void draw();
}
public class ch25_4 {
	public static void main(String[] args) {
		int r = 5;							// ��b�|
		Shapes obj = ()->{					// Lambda��F��
				System.out.println("ø�b�|�O " + r + " ����");
		};
		obj.draw();
	}
}

