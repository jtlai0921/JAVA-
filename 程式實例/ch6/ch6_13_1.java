import java.util.Scanner;
public class ch6_13_1 {
	public static void main(String[] args) {
		int x1, x2;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�п�J2�Ӿ��(�Ʀr���Ϊťչj�}) : ");
		while ( !scanner.hasNextInt() ) {	// �p�G���OŪ���ưj��N�~��
			System.out.println("��J�Ĥ@����ƫ��A���~�п�J���");
			scanner.next();					// ��Ū�r���O�N�����~���Ū��
		}
		x1 = scanner.nextInt();
		while ( !scanner.hasNextInt() ) {	// �p�G���OŪ���ưj��N�~��
			System.out.println("��J�ĤG����ƫ��A���~�п�J���");
			scanner.next();					// ��Ū�r���O�N�����~���Ū��
		}
		x2 = scanner.nextInt();
		System.out.println("�A��J���Ĥ@�ӼƦr�O : " + x1);
		System.out.println("�A��J���ĤG�ӼƦr�O : " + x2);
		System.out.println("�Ʀr�`�M�O           : " + (x1 + x2));
	}
}

