public class ch20_15 {
	public static String myTest() {
		try {
			return "���Ӭ�ޤj��";
		}
		finally {
			System.out.println("�o�Ofinally block");
			System.out.println("�Y��try�϶���return�ԭz�]�|����");
		}
	}
	public static void main(String[] args) {
		System.out.println(ch20_15.myTest());
	}
}

