class Shape {
	public void draw( ) {						// �©w�q
	}
}
class Rectangle extends Shape {					// �w�qRectangle�x�����O
	public void draw() {						// ø�s�x��
		System.out.println("ø�s�x��");
	}
}
class Circle extends Shape {					// �w�qCircle������O
	public void draw() {						// ø�s��
		System.out.println("ø�s��");
	}
}
public class ch16_1 {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();	// �w�qrectangle����
		Circle circle = new Circle();			// �w�qcircle����
		rectangle.draw();
		circle.draw();
	}
}

