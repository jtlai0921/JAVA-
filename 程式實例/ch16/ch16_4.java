abstract class Shape {							// �w�q��H���OShape	
	public void draw( ) {						// �©w�q
	}
}
class Circle extends Shape {					// �w�qCircle������O
	public void draw() {						// ø�s��
		System.out.println("ø�s��");
	}
}
public class ch16_4 {
	public static void main(String[] args) {
		Circle circle = new Circle();			// �w�qcircle����
		circle.draw();
	}
}

