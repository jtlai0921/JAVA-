class School {
	void college() {							// college()��k
		int students = 400;						// �ǥͤH��
		class Mis {								// �w�q��ިt���O
			public int getNum() {
				return students;				// �Ǧ^�ǥͤH��
			}
		}
		Mis inner = new Mis();					// �إߤ������O����
		System.out.println("�ǥͤH�� : " + inner.getNum());
	}
}
public class ch14_37 {
	public static void main(String[] args) {
		School sc = new School();				// �w�qSchool����
		sc.college();
	}
}

