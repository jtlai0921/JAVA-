public class ch8_23 {
	public static void main(String[] args) {
		System.out.println("3���������G�O = " + factorial(3));
		System.out.println("5���������G�O = " + factorial(5));
	}
	public static int factorial(int n) {
		if ( n == 1 )
			return 1;
		else
			return (n * factorial(n-1));
	}
}

