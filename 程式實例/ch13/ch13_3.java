import java.util.Scanner;
public class ch13_3 {
	public static void main(String[] args) {
		String str = new String( );
		String pattern = "\\d";			// �]�w���W��F��
		Scanner scanner = new Scanner(System.in);		
		System.out.println("�п�J���N�r�� : ");
		str = scanner.next();			// �H�r��覡Ū����J
		if (str.matches(pattern))		// ���W��F�����
			System.out.printf("%s : �O0-9�Ʀr\n", str);
		else			
			System.out.printf("%s : ���O0-9�Ʀr\n", str);		
	}
}

