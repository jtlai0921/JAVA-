public class ch13_9 {
	public static void main(String[] args) {
		String str1 = "02-23339999";
		String str2 = "(02)-23339999";
		String str3 = "(111)-1111111";
		String pattern = "\\(\\d{2}\\)-\\d{8}";		// �b���W��F���H�A���B�z�ϰ츹�X
		System.out.println("02-23339999   : �O�x�_���ϸ��X" + str1.matches(pattern));
		System.out.println("(02)-23339999 : �O�x�_���ϸ��X" + str2.matches(pattern));
		System.out.println("(111)-1111111 : �O�x�_���ϸ��X" + str3.matches(pattern));
	}
}

