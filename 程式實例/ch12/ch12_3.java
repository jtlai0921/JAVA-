public class ch12_3 {
	public static void main(String[] args) {
		char ch = '��';	
		System.out.println("�� �O�j�g�r�� " + Character.isUpperCase(ch));
		System.out.println("�� �O�p�g�r�� " + Character.isLowerCase(ch));
		System.out.println("�� �O�r���r�� " + Character.isLetter(ch));
		System.out.println("�� �O�Ʀr�r�� " + Character.isDigit(ch));
		System.out.println("�� �O�r���μƦr " + Character.isLetterOrDigit(ch));
	}
}

