public class ch4_18 {
	public static void main(String[] args) {
		boolean a = false;
		int i = 5;
		System.out.println("�ާ@ &&  ���G = " + (a && (i++ == 5)));
		System.out.println("i = " + i);
		System.out.println("�ާ@  &  ���G = " + (a & (i++ == 5)));
		System.out.println("i = " + i);
	}
}

