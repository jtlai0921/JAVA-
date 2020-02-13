import java.util.*;
public class ch20_9 {
	public static void main(String[] args) {
		int x1, x2;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("請輸入2個整數(數字間用空白隔開) : ");
		try {
			x1 = scanner.nextInt();
			x2 = scanner.nextInt();
			System.out.println("數字除法結果是 : " + (x1 / x2));
		}
		catch(ArithmeticException|InputMismatchException e) {
			System.out.println("輸入錯誤" + e);
		}
		System.out.println("ch20_9.java程式結束");
	}
}

