import java.util.Scanner;
public class ch20_2 {
	public static void main(String[] args) {
		int x;
		Scanner scanner = new Scanner(System.in);		
		System.out.print("�п�J��� : ");
		x = scanner.nextInt();					// Ū����J
		for ( int i = 0; i < x; i++ ) {			// �o�O�~��
			for ( int j = 0; j < x; j++ ) {		// �o�O����
				System.out.print("*");			// ��X�Ÿ�
			}
			System.out.println();				// �����X
		}
	}
}

