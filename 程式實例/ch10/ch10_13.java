import java.util.Random;
public class ch10_13 {
	public static void main(String[] args) {
		Random ran = new Random();
		for ( int i = 0; i < 10; i++ ) {
			System.out.printf("%d \t", ran.nextInt(100));	// ����0-99�H����
			System.out.printf("%d \n", ran.nextInt());		// ����int�Ƚd���H����
		}
	}
}

