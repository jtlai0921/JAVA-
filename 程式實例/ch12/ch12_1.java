public class ch12_1 {
	public static void main(String[] args) {
		char ch1 = 'A';
		char ch2 = '5';		
		System.out.println("A �O�j�g�r�� " + Character.isUpperCase(ch1));
		System.out.println("A �O�p�g�r�� " + Character.isLowerCase(ch1));
		System.out.println("A �O�r���r�� " + Character.isLetter(ch1));
		System.out.println("A �O�Ʀr�r�� " + Character.isDigit(ch1));
		System.out.println("5 �O�Ʀr�r�� " + Character.isDigit(ch2));
		System.out.println("5 �O�r���μƦr " + Character.isLetterOrDigit(ch2));
		System.out.println("A �O�r���μƦr " + Character.isLetterOrDigit(ch1));
	}
}

