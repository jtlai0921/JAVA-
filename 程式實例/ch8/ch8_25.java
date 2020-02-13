import java.util.Scanner;
public class ch8_25 {
	public static void hannoi(int discNum, char from, char buffer, char to) {
		if (discNum == 1) {								// ���j�I�s���������
			System.out.printf("�N %d ���Фl�q %C ", discNum, from);
			System.out.printf("���ʨ� %C \n", to);
		}
		else {											
			hannoi(discNum-1, from, to, buffer);		// �N�W��discNum-1��L��A���ʨ�B
			System.out.printf("�N %d ���Фl�q %C ", discNum, from);
			System.out.printf("���ʨ� %C \n", to);
			hannoi(discNum-1, buffer, from, to);		// �N�W��discNum-1��L��B���ʨ�C
		}
	}
	public static void main(String[] args) {
		int discNum;
		Scanner scanner = new Scanner(System.in);
		System.out.print("�п�J��L�ƶq : ");
		discNum = scanner.nextInt();
		hannoi(discNum, 'A', 'B', 'C');
	}
}
 
