import java.util.Scanner;
public class ch6_10 {
	public static void main(String[] args) {
		final int pwd = 70;				// �K�X�Ʀr
		int num;						// �x�s�Ҳq���Ʀr
		Scanner scanner = new Scanner(System.in);
		
		for ( ; ; ) {					// �o�O�L���j��
			System.out.print("�вq0-99���Ʀr : ");
			num = scanner.nextInt();	// Ū����J�Ʀr
			if ( num == pwd ) {
				System.out.println("���߲q��F!!");
				break;
			}
			System.out.println("�q���F�ЦA���@��!");
		}
	}
}

