import java.util.Scanner;public class ch13_22 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String pattern = new String();		// ���W��F���r�ꪫ��
		String str = new String();			// ���զr�ꪫ��
		
		System.out.print("�п�J���W��F���r�� : ");
		pattern = scanner.next();
		System.out.print("�п�J���զr�� : ");
		str = scanner.next();			
		System.out.println("��ﵲ�G " + str.matches(pattern));
	}
}

