public class ch8_8 {
	public static void swap(int x, int y) {
		int tmp = x;								// �H�U2��i�H�F��x,y��ƹ��
		x = y;
		y = tmp;
		System.out.printf("swap��k����   x = %d,  y = %d\n", x, y);
	}
	public static void main(String[] args) {
		int x, y;
		x = 10;
		y = 20;
		System.out.printf("�I�sswap��k�e x = %d,  y = %d\n", x, y);
		swap(x, y);									// �I�sswap��k�e
		System.out.printf("�I�sswap��k�� x = %d,  y = %d\n", x, y);
	}
}

