public class ch13_5 {
	public static void main(String[] args) {
		String str1 = "I love Java";
		String str2 = "0952-909-090";
		String str3 = "1111-1111111";
		String pattern = "\\d\\d\\d\\d-\\d\\d\\d-\\d\\d\\d";
		System.out.println("I love Java :�O�x�W������X" + str1.matches(pattern));
		System.out.println("0952-909-090:�O�x�W������X" + str2.matches(pattern));
		System.out.println("1111-1111111:�O�x�W������X" + str3.matches(pattern));
	}
}

