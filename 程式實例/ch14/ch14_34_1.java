class School {
	private class Motto {				// Inner class
		public void printInfo() {
			System.out.println("�ԳҾ��");
		}
	}
	void display() {					// Ū��Inner class
		Motto meobj = new Motto();		// �إߤ������Omotto����
		meobj.printInfo();
	}
}
public class ch14_34_1 {
	public static void main(String[] args) {
		School sc = new School();		// �w�qSchool����
		//sc.display();					// �I�sdisplay()��k
		sc.printInfo();					// �����I�s�������O����k
	}
}
