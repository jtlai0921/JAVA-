import java.util.Scanner;
public class ch6_15 {
	public static void main(String[] args) {
		String msg, msg1, msg2, input_msg;
		char again;
		Scanner scanner = new Scanner(System.in);
		msg1 = "�H����ܱM��,�i�D�ڤߨƧa,�ڷ|���ƧA�i�D�ڪ��ߨ�!";
		msg2 = "��J q �i�H������� = ";
		msg = msg1 + '\n' + msg2;
		again = ' '; 							// �O�_�~��r��,�w�]���Ŧr��
		
		while ( again != 'q' ) {				// �p�G�Oq�h������j��		
			System.out.print(msg);				// �C�X���ܰT��
			input_msg = scanner.next();			// Ū����J�r��
			System.out.println(input_msg);		// �C�X�ҿ�J�T��
			again = input_msg.charAt(0);		// ���o�ҿ�J����1�Ӧr��
		}
	}
} 

