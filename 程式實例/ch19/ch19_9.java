import java.util.Scanner;						// �����O�פJ�ŧi
import static java.lang.Math.PI;				// ���R�A�ܼƶפJ�ŧi
import static java.lang.System.in;				// ���R�A�ܼ�in�פJ�ŧi
import static java.lang.System.out;				// ���R�A�ܼ�out�פJ�ŧi
public class ch19_9 {
	public static void main(String[] args) {
		double r;
		Scanner scanner = new Scanner(in);		// in���NSystem.in
		
		out.print("�п�J��b�| : ");			// out���NSystem.out
		r = scanner.nextDouble();				// Ū���b�|
		out.println("��P�� : " + (2 * PI * r));// out���NSystem.out
	}
}

