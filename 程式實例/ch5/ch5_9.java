import java.util.Scanner;
public class ch5_9 {
	public static void main(String[] args) {
		double price;
		int age;
		int ticket = 100;						// �зǲ���
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�p�Ⲽ��");
		System.out.print("�п�J�~�� : ");
		age = scanner.nextInt();				// Ū���~�ָ��
		if (age >= 80 || age <= 6) {
			price = ticket * 0.2;				// �p�⥴ 2 �鲼��		
			System.out.print("�����O : " + price);
		} else if (age >= 60 || age <= 12) {
			price = ticket * 0.5;				// �p�⥴ 5 �鲼��
			System.out.print("�����O : " + price);
		} else {
			price = ticket;						// �����鲼��
			System.out.print("�����O : " + price);
		}
	}
}

