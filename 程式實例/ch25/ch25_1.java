abstract class StringAdd<T> {								// �w�q��H���O
	abstract T display(T x, T y);
}
public class ch25_1 {
	public static void main(String[] args) {
		StringAdd<String> obj = new StringAdd<String>() { 	// �٧βŸ�����ƫ��A
			String display(String x, String y) {
				return x + y;
			}
		};
		System.out.println(obj.display("Java", "�����k��"));	
	}
}

