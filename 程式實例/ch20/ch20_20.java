import java.util.*;
public class ch20_20 {
	public static void myMethod() throws ArithmeticException, InputMismatchException {
		Scanner scanner = new Scanner(System.in);
		int x1, x2;
		System.out.println("�п�J2�Ӿ��(�Ʀr���Ϊťչj�}) : ");
		x1 = scanner.nextInt();								// 	Ū����1�ӼƦr
		x2 = scanner.nextInt();								// 	Ū����2�ӼƦr
		System.out.println("�Ʀr���k���G�O : " + (x1 / x2));
	}
	public static void main(String[] args) {		
		try {
			myMethod();										// �i��o�Ͳ��`���ԭz
		}
		catch(ArithmeticException e) {						// ���Ƭ�0�����`
			System.out.println("���Ƭ�0�����`" + e);
		}
		catch(InputMismatchException e) {					// ��ƿ��~�����`
			System.out.println("��J����������~" + e);
		}
	}
}

