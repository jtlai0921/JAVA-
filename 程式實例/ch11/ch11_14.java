import java.time.*;
import java.util.*;
public class ch11_14 {
	public static void main(String[] args) {
		LocalDateTime from, to;				// �����ɶ��}�l�P����
		final int pwd = 70;					// �K�X�Ʀr
		int num;							// �x�s�Ҳq���Ʀr
		Scanner scanner = new Scanner(System.in);
		from = LocalDateTime.now();			// �����ɶ��}�l
		for ( ; ; ) {						// �o�O�L���j��
			System.out.print("�вq0-99���Ʀr : ");
			num = scanner.nextInt();		// Ū����J�Ʀr
			if ( num == pwd ) {
				System.out.println("���߲q��F!!");
				to = LocalDateTime.now();	// �����ɶ�����
				break;
			}
			System.out.println("�q���F�ЦA���@��!");
		}
		Duration dura = Duration.between(from, to);
		System.out.println("�Ҫ�ɶ��`�Ѽ� " + dura.toDays());
		System.out.println("�Ҫ�ɶ��p�ɼ� " + dura.toHours());
		System.out.println("�Ҫ�ɶ������� " + dura.toMinutes());
		System.out.println("�Ҫ�ɶ��`��� " + dura.toSeconds());
		System.out.println("�Ҫ�ɶ��@��� " + dura.toMillis());
		System.out.println("�Ҫ�ɶ��`��� " + dura.toNanos());		
	}
}

