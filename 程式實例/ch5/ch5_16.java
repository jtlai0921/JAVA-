import java.util.Scanner;
public class ch5_16 {
	public static void main(String[] args) {
		int fruit, k;
		Scanner scanner = new Scanner(System.in);
		System.out.println("���G�P��");
		System.out.println("1:ī�G(20��/��)	2:����(18��/��)	3:���(10��/��)");
		System.out.print("�п�J�ҿ���G(1, 2��3) : ");	
		fruit = scanner.nextInt();					// Ū���ҿ���G
		System.out.print("�п�J�ʶR�X�� : ");	
		k = scanner.nextInt();						// Ū���ʶR�X��									
		switch (fruit) {	
			case 1:
				System.out.println("�`���B" + (k * 20));
				break;
			case 2:
				System.out.println("�`���B" + (k * 18));
				break;
			case 3:
				System.out.println("�`���B" + (k * 10));
				break;	
			default:
				System.out.println("���G�����~");
		}
	}
}

