class MyData {							// ��Ƹ��
	int obj;
	void setobj(int obj) {
		this.obj = obj;					// �]�w���
	}
	int getobj() {
		return this.obj;				// �^�Ǿ��
	}
}
public class ch24_00 {	
	public static void main(String[] args) {
		MyData m = new MyData();		// �إߪ���
		m.setobj(10);					// �]�w��ƭ�
		System.out.println(m.getobj());	// �C�L��ƭ�
	}
}

