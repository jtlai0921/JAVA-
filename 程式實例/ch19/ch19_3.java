import java.util.*;										// �̻ݨD�פJ���O�ŧi
public class ch19_3 {
	public static void main(String[] args) {
		Random ran = new Random();						// �ݩ�java.util.Random
		int pwd = ran.nextInt(10);						// ����0-9�����ؼмƦr
		int num;										// �x�s�Ҳq�Ʀr
		Scanner scanner = new Scanner(System.in);		// �ݩ�java.util.Scanner
		
		for ( ; ; ) {									// �o�O�L���j��
			System.out.print("�вq0-9���Ʀr : ");
			num = scanner.nextInt();					// Ū����J�Ʀr
			if ( num == pwd ) {							// �p�G�q��
				System.out.println("���߲q��F!!");
				break;
			}
			if ( num > pwd ) 							// ���ܨϥΪ̲q�Ʀr��V
				System.out.println("�q���F�вq�p�@�I!!");
			else 
				System.out.println("�q���F�вq�j�@�I!!");
		}
	}
}

