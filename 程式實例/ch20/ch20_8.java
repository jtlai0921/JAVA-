import java.util.*;
public class ch20_8 {
	public static void main(String[] args) {
		int x1, x2;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�п�J2�Ӿ��(�Ʀr���Ϊťչj�}) : ");
		try {
			x1 = scanner.nextInt();
			x2 = scanner.nextInt();
			System.out.println("�Ʀr���k���G�O : " + (x1 / x2));
		}
		catch(ArithmeticException e) {
			System.out.println("���Ƭ�0�����`" + e);
		}
		catch(InputMismatchException e) {
			System.out.println("��J����������~" + e);
		}
		System.out.println("ch20_8.java�{������");
	}
}

