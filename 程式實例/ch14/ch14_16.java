class MyMath {								// �B�z��b�|�������
	protected int square(int x) {
		return x*x;
	}
}
class Circle {
	protected MyMath obj;					// Aggregation
	public double getArea(int radius) {
		obj = new MyMath();					// �إ�MyMath����
		int rSquare = obj.square(radius);	// �{���X�i���ƨϥ�
		return Math.PI*rSquare;				// �^�Ƕꭱ�n
	}
}
public class ch14_16 {
	public static void main(String[] args) {
		Circle circle = new Circle();		// �إ�Circle����
		double area = circle.getArea(10);	// �p��ꭱ�n
		System.out.printf("�ꭱ�n�O : %6.2f\n", area);
	}
}

