public class ch12_22 {
	public static void main(String[] args) {
		String str1 = "A123456789";
		String str2 = "a123456789";
		int result1 = str1.compareTo(str2);
		if (result1 == 0)
			System.out.println("�Ҽ{�j�p�g  str1 == str2�Otrue");
		else
			System.out.println("�Ҽ{�j�p�g  str1 == str2�Ofalse");
		int result2 = str1.compareToIgnoreCase(str2);
		if (result2 == 0)
			System.out.println("���Ҽ{�j�p�gstr1 == str2�Otrue");
		else
			System.out.println("���Ҽ{�j�p�gstr1 == str2�Ofalse");
	}
}

