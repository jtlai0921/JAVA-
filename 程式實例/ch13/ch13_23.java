public class ch13_23 {
	public static void main(String[] args) {
		String str = "Hello! Java! I love Java.";
		String pattern = "Java";		// ���W��F��
		System.out.println(str.replaceFirst(pattern, "Python"));
		pattern = ".*(Java).*";			// �s�����W��F��
		System.out.println(str.replaceFirst(pattern, "Python"));
	}
}

