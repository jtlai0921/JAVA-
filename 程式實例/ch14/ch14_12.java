class MyMath {
	protected int result;				// �ŧiprotected�s���׹��ũw�q�p�⵲�G
	public void add(int x, int y) {		// MyMath���O��kadd
		this.result = x + y;
		System.out.println("�[�k���G : " + this.result);
	}
	public void sub(int x, int y) {		// MyMath���O��ksub
		this.result = x - y;
		System.out.println("��k���G : " + this.result);
	}
}
public class ch14_12 extends MyMath {
	public void mul(int x, int y) {		// ch14_12���O��kmul
		result = x * y;
		System.out.println("���k���G : " + result);
	}
	public static void main(String[] args) {
		ch14_12 obj = new ch14_12();	// �w�qch14_12���O����
		int a1 = 50, a2 = 5;
		obj.add(a1, a2);				// �I�s�~�Ӥ�kadd()
		obj.sub(a1, a2);				// �I�s�~�Ӥ�ksub()
		obj.mul(a1, a2);				// �I�s�ۤv���O��kmul()
	}
}

