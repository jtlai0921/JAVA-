class MyMath {
	int x;									
	void math(int a) {							// �t1�Ӿ�ưѼ�
		x = a;
	}
	void math(int a, int b) {					// �t2�Ӿ�ưѼ�
		x = a * b;
	}
	void math(int a, int b, int c) {			// �t3�Ӿ�ưѼ�
		x = a * b * c;
	}
	void printInfo( ) {							
		System.out.println(x);				
	}
}
public class ch9_8 {
	public static void main(String[] args) {
		MyMath A = new MyMath();
		A.math(10);
		A.printInfo();
		A.math(10, 10);
		A.printInfo();
		A.math(10, 10, 10);
		A.printInfo();	
	}
}
 
