import java.util.Scanner;
public class ch5_11 {
	public static void main(String[] args) {
		int year;	
		int rem4, rem100, rem400;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�P�_��J�~���O�_��~");
		System.out.print("�п�J���N�r�� : ");
		year = scanner.nextInt();				// Ū���~�����
		rem4 = year % 4;
		rem100 = year % 100;
		rem400 = year % 400;
		if (rem4 == 0) 
			if (rem100 != 0 || rem400 == 0)
				System.out.printf("%d �O��~", year);
			else
				System.out.printf("%d ���O��~", year);
		else
			System.out.printf("%d ���O��~", year);
	}
}

