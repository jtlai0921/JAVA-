class Animal {
	public void moving() {
		System.out.println("�ʪ��i�H����");
	}
}
public class ch14_39 {
	public static void main(String[] args) {
		new Animal() {					// �S���ŧi����
			public void moving() {
				System.out.println("�ߥi�H�����M��");
			}
		}.moving();						// �����I�s��k
	}
}

