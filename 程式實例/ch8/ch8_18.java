class ShadowingTest {
	int x = 10;
	void printInfo(int x) {
		System.out.println("�ϰ��ܼ� " + x);
		System.out.println("�����ݩ� " + this.x);
	}
}
public class ch8_18 {
	public static void main(String[] args) {
		ShadowingTest A = new ShadowingTest();
		A.printInfo(20);
	}
}

