class SmallMath {
	int x, y;
	SmallMath(int a, int b) {				// �۫ثغc��k	
		x = a;
		y = b;
	}
	void add() {							// ����M�C�L�[�k�B��
		System.out.println("�[�k���G : " + (x + y));
	}
	void mul() {							// ����M�C�L���k�B��
		System.out.println("���k���G : " + (x * y));
	}
}

public class ch9_4 {
	public static void main(String[] args) {
		SmallMath A = new SmallMath(5, 10);	// ���O����
		A.add();							// �C�L�[�k���G
		A.mul();							// �C�L���k���G
	}
}
 

