public class ch7_18 {
	public static void main(String[] args) {
		int[] x = {6, 9, 2};				// �w�q��ư}�C
		System.out.println("���x�}�C���e");
		for (int num:x)
			System.out.printf("%d\t", num);
		
		System.out.printf("\n���ѷөM�s��x�}�C���e\n");
		x = new int[2];						// ���ѷ�
		x[0] = 10;
		x[1] = 20;
		for (int num:x)
			System.out.printf("%d\t", num);
	}
}

