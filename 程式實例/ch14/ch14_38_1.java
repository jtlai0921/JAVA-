class Animal {
	public void moving() {
		System.out.println("�ʪ��i�H����");
	}
}
public class ch14_38_1 {
	public static void main(String[] args) {
		new Animal() {
			public void moving() {
				System.out.println("�ߥi�H�����M��");
			}
		}.moving();
	}
}

