class Animal {
	public void moving() {
		System.out.println("�ʪ��i�H����");
	}
}
public class ch14_38 {
	public static void main(String[] args) {
		Animal inner = new Animal() {		// �ŧi�ΦW�������O����
			public void moving() {
				System.out.println("�ߥi�H�����M��");
			}
		};
		inner.moving();						// ����I�smoving( )��k					
	}
}

