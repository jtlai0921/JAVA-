import java.util.Scanner;
public class ch6_11 {
	public static void main(String[] args) {
		final int pwd = 70;				// �K�X�Ʀr		
		int count = 1;					// �p��Ҳq������
		int num;						// �x�s�Ҳq���Ʀr
		Scanner scanner = new Scanner(System.in);
		
		while ( count <= 5 ) {			// �̦h�i�H�q5��
			System.out.print("�вq0-99���Ʀr : ");
			num = scanner.nextInt();	// Ū����J�Ʀr
			if ( num == pwd ) {
				System.out.println("���߲q��F!!");
				break;
			}
			if ( count == 5 )			// �̲q�����ƿ�X�r��
				System.out.println("�̦h�u��q5��, bye!");
			else
				System.out.println("�q���F�ЦA���@��!");
			count++;					// �Nwhile�j���ܼƥ[1
		}
	}
}

