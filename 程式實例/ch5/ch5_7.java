import java.util.Scanner;
public class ch5_7 {
	public static void main(String[] args) {
		int age;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�п�J�~�� : ");
		age = scanner.nextInt();			// Ū���~�ָ��
		if (age <= 59 && age >= 45)
			System.out.println("�A�O���~�H");
		else 
			System.out.println("�A���O���~�H");
	}
}

