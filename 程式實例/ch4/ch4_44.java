import java.util.Scanner;
public class ch4_44 {
	public static void main(String[] args) {
		int x1, x2;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�п�J2�Ӿ��(�Ʀr���Ϊťչj�}) : ");
		x1 = scanner.nextInt();
		x2 = scanner.nextInt();
		System.out.println("�A��J���Ĥ@�ӼƦr�O : " + x1);
		System.out.println("�A��J���ĤG�ӼƦr�O : " + x2);
		System.out.println("�Ʀr�`�M�O           : " + (x1 + x2));
	}
}

