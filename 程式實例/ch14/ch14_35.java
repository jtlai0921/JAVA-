class School {
	class Motto {								// Inner class
		public void printInfo() {
			System.out.println("�ԳҾ��");
		}
	}
}
public class ch14_35 {
	public static void main(String[] args) {
		School sc = new School();				// �w�qSchool����
		School.Motto inner = sc.new Motto();	// �إߤ������O����
		inner.printInfo();						// �����I�s�������O����k
	}
}

