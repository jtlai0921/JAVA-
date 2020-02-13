interface Shape {										// �w�q����Shape
	double PI = 3.14;									// �w�q������Ʀ���
	double area( );										// �w�q��H��k
}
class Rectangle implements Shape {						// �w�qRectangle��@Shape
	protected double height, width;						// �w�q�ewidth�M��height			
	Rectangle(double height, double width) {			// �غc��k		
		this.height = height;
		this.width = width;
	}
	public double area() {								// �p��x�έ��n
		return height * width;
	}
}
class Circle implements Shape {							// �w�qCircle��@Shape
	protected double r;									// �w�q�b�|r			
	Circle(double r) {									// �غc��k		
		this.r = r;
	}
	public double area() {								// �p��ꭱ�n
		return PI * r * r;								// PI�Opublic�i�H������
	}
}
public class ch17_2 {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(2, 3);		// �w�qrectangle����
		Circle circle = new Circle(2);					// �w�qcircle����
		System.out.println("�x�έ��n     : " + rectangle.area());
		System.out.println("�ꭱ�n       : " + circle.area());
		System.out.println("Shape.PI     : " + Shape.PI);	   // �i������Shape�s��
		System.out.println("circle.PI    : " + circle.PI);	   // �i��circle����s��
		System.out.println("rectangle.PI : " + rectangle.PI);  // �i��rectangle����s��
	}
}

