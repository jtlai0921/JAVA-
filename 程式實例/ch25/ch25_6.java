@FunctionalInterface						// �o�O�ﶵoptional
interface Hi {								// �w�q��H���O
	public String talking(String name);
}
public class ch25_6 {
	public static void main(String[] args) {
		Hi obj = name->{					// Lambda��F���ٲ��p�A��
				return "Hi! " + name;
		};
		System.out.println(obj.talking("Peter"));
	}
}

