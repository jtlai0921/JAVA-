import java.util.*;
public class ch11_3 {
	public static void main(String[] args) {
		long startDate, endDate;			// �����ɶ��}�l�P����
		final int pwd = 70;					// �K�X�Ʀr
		int num;							// �x�s�Ҳq���Ʀr
		Scanner scanner = new Scanner(System.in);
		startDate = System.currentTimeMillis();			// �����ɶ��}�l
		for ( ; ; ) {						// �o�O�L���j��
			System.out.print("�вq0-99���Ʀr : ");
			num = scanner.nextInt();		// Ū����J�Ʀr
			if ( num == pwd ) {
				System.out.println("���߲q��F!!");
				endDate = System.currentTimeMillis();	// �����ɶ�����
				break;
			}
			System.out.println("�q���F�ЦA���@��!");
		}
		System.out.printf("�Ҫ�ɶ� %d �@��", (endDate-startDate));
	}
}

