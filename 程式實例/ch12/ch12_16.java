public class ch12_16 {
	public static void main(String[] args) {
		String str = "����L�Q�O���L�P�p�s�k���G��";
		char[] ch = new char[15];
		str.getChars(5, 11, ch, 0);
		System.out.println(ch);
	}
}

