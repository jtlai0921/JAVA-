@FunctionalInterface						// �o�O�ﶵoptional
interface myMath {							// �w�q��H���O
	int add(int x, int y);
}
public class ch25_8 {
	public static void main(String[] args) {
		myMath obj = (int x, int y)-> (x + y);	// Lambda��F��
		System.out.println(obj.add(10, 20));
	}
}

