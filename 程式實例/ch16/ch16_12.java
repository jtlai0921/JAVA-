abstract class MyMath {							// ��H���O
	abstract int add(int n1, int n2);			// ��Hadd��k
	abstract int mul(int n1, int n2);			// ���k
	void output() {								// ���鴶�q��k
		System.out.println("�ڪ��p�⾹");
	}
}
class MyTest extends MyMath {					// �w�qMyMath�l���OMyTest
	public int add(int num1, int num2) {		// ���s�w�qadd��k
		return num1 + num2;
	}
	public int mul(int num1, int num2) {		// ���s�w�qmul��k
		return num1 * num2;
	}
}
public class ch16_12 {
	public static void main(String[] args) {
		MyMath obj = new MyTest();				// Upcasting
		obj.output();
		System.out.println("�[�k���G : " + obj.add(3, 8));
		System.out.println("���k���G : " + obj.mul(3, 8));
	}
}

