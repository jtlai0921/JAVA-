public class ch13_8 {
	public static void main(String[] args) {
		String str1 = "I love Java";
		String str2 = "0952-909-090";
		String str3 = "(111)-1111111";
		String pattern = "\\d{4}(-\\d{3}){2}";		// ���W��F���H�p�A���B�z����
		System.out.println("I love Java   : �O�x�_���ϸ��X" + str1.matches(pattern));
		System.out.println("0952-909-090  : �O�x�_���ϸ��X" + str2.matches(pattern));
		System.out.println("(111)-1111111 : �O�x�_���ϸ��X" + str3.matches(pattern));
	}
}

