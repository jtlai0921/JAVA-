import java.util.Scanner;
public class ch5_2 {
	public static void main(String[] args) {
		int age;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�п�J�~�� : ");
		age = scanner.nextInt();			// Ū���~�ָ��
		if (age < 20) 
			System.out.println("�A���~�֤Ӥp�ݺ�20���~�i�H�ʶR�Ұs");
	}
}

