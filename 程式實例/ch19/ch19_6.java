import java.util.Scanner;						// �����O�פJ�ŧi
import static java.lang.Math.PI;				// ���R�A�`�ƶפJ�ŧi
public class ch19_6 {
	public static void main(String[] args) {
		double r;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�п�J��b�| : ");
		r = scanner.nextDouble();				// Ū���b�|
		System.out.println("��P�� : " + (2 * PI * r));		// �ٲ��FMath.
	}
}

