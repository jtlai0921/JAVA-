public class ch12_14_1 {
	public static void main(String[] args) {
		String str = "���Ӭ�ޤj��";
		CharSequence cs = "����";
		System.out.println("str�tcs�r�� : " + str.contains(cs));
		System.out.println("str�t- �r�� : " + str.contains("-"));
	}
}

