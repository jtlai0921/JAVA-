public class ch12_25_1 {
	public static void main(String[] args) {
		String str = "I love Java.";
		String[] words = str.split("\\s"); 	// �ϥΪťդ��Φ��r��words�}�C
		System.out.printf("str�y�l�� %d �Ӧr\n", words.length);
		for (String w:words) {
			System.out.println(w);
		}
	}
}

