import java.util.Scanner;
public class ch5_15 {
	public static void main(String[] args) {
		String lastname;
		Scanner scanner = new Scanner(System.in);
		System.out.println("�ʮa�m�ƦW");
		System.out.print("�п�J�A���m�� : ");	// �H�r��覡Ū��
		lastname = scanner.next();				// Ū���m	
		switch (lastname) {	
			case "��":
				System.out.println("�ʮa�m�ƦW��1,���e����7.94%�`�H�f��95000000�H");
				break;
			case "��":
				System.out.println("�ʮa�m�ƦW��2,���e����7.41%�`�H�f��89000000�H");
				break;
			case "�i":
				System.out.println("�ʮa�m�ƦW��3,���e����7.07%�`�H�f��85000000�H");
				break;
			case "�B":
				System.out.println("�ʮa�m�ƦW��4,���e����5.38%�`�H�f��65000000�H");
				break;
			case "��":
				System.out.println("�ʮa�m�ƦW��5,���e����4.53%�`�H�f��54000000�H");
				break;
			default:
				System.out.println("�ʮa�m��ƦW���b�e5�j");
		}
	}
}

