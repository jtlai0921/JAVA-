abstract class Shape {							// �w�q��H���OShape	
	public abstract void draw( );				// �w�q��H��k
}
class Circle extends Shape {					// �w�qCircle������O
	public void draw() {						// ø�s��
		System.out.println("ø�s��");
	}
}
public class ch16_5 {
	public static void main(String[] args) {
		Circle circle = new Circle();			// �w�qcircle����
		circle.draw();
	}
}

