public class ch12_24 {
	public static void main(String[] args) {
		char[] ch = {'��', '��', '��', '��', '�j', '��'};
		
		System.out.println(String.copyValueOf(ch));		
		System.out.println(String.copyValueOf(ch, 2, 4));
		System.out.println(String.valueOf(ch));
		System.out.println(String.valueOf(ch, 2, 4));
	}
}

