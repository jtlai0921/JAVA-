class School {
	int students = 400;							// �ǥͤH��
	class Mis {									// �w�q��ިt���O
		public int getNum() {
			return students;					// �Ǧ^�ǥͤH��
		}
	}
}
public class ch14_36 {
	public static void main(String[] args) {
		School sc = new School();				// �w�qSchool����
		School.Mis inner = sc.new Mis();		// �إߤ������O����
		System.out.println("�ǥͤH�� : " + inner.getNum());	
	}
}

