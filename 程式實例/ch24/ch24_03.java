import java.util.*;
abstract class Shapes {								// ��H���OShapes
	abstract void demo();							// ��H��kdemo 
}
class Square extends Shapes {						// Square�~��Shapes
	void demo() {
		System.out.println("�ڬO�����");
	}
}
class Circle extends Shapes {						// Circle�~��Shapes
	void demo() {
		System.out.println("�ڬO���");
	}
}
public class ch24_03 {	
// <? extends Shapes>��ܩҦ��l�ͦ�Shapes�����O�ҥi�H����
	public static void demoShapes(ArrayList<? extends Shapes> lists) {
		for(Shapes list:lists)
			list.demo();							// ����demo
	}
	public static void main(String[] args) {
		ArrayList<Square> alist1 = new ArrayList<Square>();
		alist1.add(new Square());					// alist1���󤸯��OSquare���O����
		ArrayList<Circle> alist2 = new ArrayList<Circle>();
		alist2.add(new Circle());					// alist2���󤸯��OCircle���O����
		demoShapes(alist1);
		demoShapes(alist2);
	}
}

