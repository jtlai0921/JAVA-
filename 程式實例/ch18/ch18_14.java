public class ch18_14 {
	public static void main(String[] args) {
		int i = Integer.parseInt("127");
		int i2 = Integer.parseInt("101", 2);		// �r��O2�i��
		int i8 = Integer.parseInt("101", 8);		// �r��O8�i��
		int i16 = Integer.parseInt("101", 16);		// �r��O16�i��
		double d = Double.parseDouble("100.0123");	// �r��ODouble���O
		
		System.out.println(i);
		System.out.println(i2);
		System.out.println(i8);
		System.out.println(i16);
		System.out.println(d);
	}
}

