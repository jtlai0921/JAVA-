interface Shapes {							// �w�q��H���O
	public void draw();
}
public class ch25_3 {
	public static void main(String[] args) {
		int r = 5;							// ��b�|
		Shapes obj = new Shapes() {			// �ΦW���O
			public void draw() {			// ���s�w�qdraw()
				System.out.println("ø�b�|�O " + r + " ����");
			}
		};
		obj.draw();	
	}
}

