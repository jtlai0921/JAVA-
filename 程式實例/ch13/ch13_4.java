import java.util.Scanner;
public class ch13_4 {
	public static void main(String[] args) {
		String str = new String( );
		String pattern = "\\d\\d\\d\\d";	// �]�w���W��F��
		Scanner scanner = new Scanner(System.in);		
		System.out.println("�п�J���N�r�� : ");
		str = scanner.next();				// �H�r��覡Ū����J
		if (str.matches(pattern))			// ���W��F�����
			System.out.printf("%s : �O4��0-9�Ʀr\n", str);
		else			
			System.out.printf("%s : ���O4��0-9�Ʀr\n", str);		
	}
}

