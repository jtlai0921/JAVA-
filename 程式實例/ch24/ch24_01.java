class MyData<T>{									// �x�����
	private T obj;				
	void setobj(T obj) {
		this.obj = obj;								// �]�w�x��
	}
	public T getobj() {
		return this.obj;							// �^�Ǫx��
	}
}
public class ch24_01 {	
	public static void main(String[] args) {
		MyData<Integer> m = new MyData<Integer>();	// �إ߾�ƪ���
		m.setobj(10);								// �]�w��ƭ�
		System.out.println(m.getobj());				// �C�L��ƭ�
		MyData<Double> d = new MyData<Double>();	// �إ������g�ׯB�I�ƪ���
		d.setobj(10.0);								// �]�w�����g�ׯB�I�ƭ�
		System.out.println(d.getobj());				// �C�L�����g�ׯB�I�ƭ�
		MyData<String> str = new MyData<String>();	// �إߦr�ꪫ��
		str.setobj("�����k��");						// �]�w�r��
		System.out.println(str.getobj());			// �C�L�r��
	}
}

