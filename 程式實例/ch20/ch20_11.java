import java.util.*;
public class ch20_11 {
	public static void main(String[] args) {
		int x1, x2;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�п�J2�Ӿ��(�Ʀr���Ϊťչj�}) : ");
		try {
			x1 = scanner.nextInt();
			x2 = scanner.nextInt();
			System.out.println("�Ʀr���k���G�O : " + (x1 / x2));
		}
		catch(ArithmeticException e) {					// �������Ƭ�0
			System.out.println("���Ƭ�0 : " + e);
		}
		catch(StringIndexOutOfBoundsException e) {		// �������޶W�X�d��
			System.out.println("�r��W�X����" + e);
		}
		catch(RuntimeException e) {						// ������L�Ҧ����`				
			System.out.println("���`�o��" + e);
		}
		System.out.println("ch20_11.java�{������");
	}
}

