public class ch12_5 {
	public static void main(String[] args) {
		char ch = '1';
		System.out.println("1 �b16�i�줤�ҥN���ƭ�" + Character.digit(ch, 16));
		System.out.println("9 �b16�i�줤�ҥN���ƭ�" + Character.digit('9', 16));
		System.out.println("A �b16�i�줤�ҥN���ƭ�" + Character.digit('A', 16));
		System.out.println("F �b16�i�줤�ҥN���ƭ�" + Character.digit('F', 16));
		System.out.println("G �b16�i�줤�ҥN���ƭ�" + Character.digit('G', 16));
	}
}

