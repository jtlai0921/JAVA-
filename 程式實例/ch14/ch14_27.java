class School {
	public void demo() {				// 	�����O��demo()��k	
		System.out.println("���Ӭ�j");
	}
}
class Department extends School {			
	public void demo() {				// ���s�w�q�����O��demo()��k	
		System.out.println("���Ӭ�j����t");
	}
}
public class ch14_27 {
	public static void main(String[] args) {
		School A = new School();
		School B = new Department();	// Upcasting
		A.demo();						// �եΤ����Odemo()��k
		B.demo();						// �եΤl���Odemo()��k
	}
}

