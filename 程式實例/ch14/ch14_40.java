class Animal {
	String moving() {
		return "�ʪ��i�H����";
	}
}
class myCat {
	public void showMsg(Animal obj) {	// �������O��Ѽ�
		System.out.println("�ΦW���O��Ѽƶǰe : " + obj.moving());
	}
}
public class ch14_40 {
	public static void main(String[] args) {
		myCat obj = new myCat(); 		// �إ�MyCat���O����
		obj.showMsg(new Animal() {		// �Ҷǻ����ѼƬO�ΦW�������O
			public String moving() {
				return "�ߥi�H�����M��";
			}
		});
	}
}

