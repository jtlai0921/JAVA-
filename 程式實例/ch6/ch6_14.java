import java.util.Scanner;
public class ch6_14 {
	public static void main(String[] args) {
		boolean  prime = true;					// �̪��ƺX�ЬOtrue
		int num;								// ��J�Ʀr
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�п�J�j��1����ư���ƴ��� : ");
		num = scanner.nextInt();
		if ( num == 2 )							// 2�O���
			System.out.printf("%d �O���", num);
		else {
			for ( int i = 2; i < num; i++ ) {	// ���ձq2��num-1
				if ( (num % i) == 0 ) {			// �i�H�㰣�N���O���
					System.out.printf("%d ���O���", num);
					prime = false;				// ����ƺX�Ь�false
					break;
				}
			}
			if ( prime )						// �p�G��ƺX�ЬOtrue
				System.out.printf("%d �O���", num);
		}
	}
} 

