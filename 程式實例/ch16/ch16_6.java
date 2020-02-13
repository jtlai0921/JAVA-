abstract class Shape {									// �w�q��H���O
	public abstract double area( );						// �w�q��H��k
}
class Rectangle extends Shape {							// �w�qRectangle�x�����O
	protected double height, width;						// �w�q�ewidth�M��height			
	Rectangle(double height, double width) {			// �غc��k		
		this.height = height;
		this.width = width;
	}
	public double area() {								// �p��x�έ��n
		return height * width;
	}
}
class Circle extends Shape {							// �w�qCircle������O
	protected double r;									// �w�q�b�|r			
	Circle(double r) {									// �غc��k		
		this.r = r;
	}
	public double area() {								// �p��ꭱ�n
		return Math.PI * r * r;
	}
}
public class ch16_6 {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(2, 3);		// �w�qrectangle����
		Circle circle = new Circle(2);					// �w�qcircle����
		System.out.println("�x�έ��n : " + rectangle.area());
		System.out.println("�ꭱ�n   : " + circle.area());	
	}
}

