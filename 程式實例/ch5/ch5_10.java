import java.util.Scanner;
public class ch5_10 {
	public static void main(String[] args) {
		char ch;						
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�P�_��J�r�����O");
		System.out.print("�п�J���N�r�� : ");
		ch = scanner.next().charAt(0);				// Ū���r�����
		if (ch >= 'A' && ch <= 'Z') 	
			System.out.println("�o�O�j�g�r��");
		else if (ch >= 'a' && ch <= 'z')
			System.out.println("�o�O�p�g�r��");
		else if (ch >= '0' && ch <= '9')
			System.out.println("�o�O�Ʀr");
		else
			System.out.println("�o�O�S��r��");
	}
}

