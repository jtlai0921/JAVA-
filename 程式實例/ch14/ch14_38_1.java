class Animal {
	public void moving() {
		System.out.println("動物可以活動");
	}
}
public class ch14_38_1 {
	public static void main(String[] args) {
		new Animal() {
			public void moving() {
				System.out.println("貓可以走路和跳");
			}
		}.moving();
	}
}

