class DataBank {
	int x, y;
}
public class ch8_9 {
	public static void swap(DataBank B) {
		int tmp = B.x;							// �H�U2��i�H�F��x,y��ƹ��
		B.x = B.y;
		B.y = tmp;
		System.out.printf("swap��k����   x = %d,  y = %d\n", B.x, B.y);
	}
	public static void main(String[] args) {
		DataBank A = new DataBank();
		A.x = 10;
		A.y = 20;
		System.out.printf("�I�sswap��k�e x = %d,  y = %d\n", A.x, A.y);
		swap(A);								// �I�sswap��k�e
		System.out.printf("�I�sswap��k�� x = %d,  y = %d\n", A.x, A.y);
	}
}

