import java.util.Scanner;
public class ch5_6 {
	public static void main(String[] args) {
		int x;
		Scanner scanner = new Scanner(System.in);
		System.out.println("��X����Ȫ�����");
		System.out.print("�п�J���N��� : ");
		x = scanner.nextInt();		// Ū���ù���J
		if (x > 0) 
			System.out.println("����ȬO" + x);
		else
			System.out.println("����ȬO" + -x);
	}
}

