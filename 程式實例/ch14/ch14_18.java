class Car {
	private int maxSpeed;
	private String color;	
	public void setMaxSpeed(int maxSpeed) {			// �]�w�̰��t�פ�k
		this.maxSpeed = maxSpeed;
	}
	public void setColor(String color) {			// �]�w���l�C���k
		this.color = color;
	}
	public void printCarInfo() {
		System.out.println("���l�̰��ɳt : " + maxSpeed +"\n���l�~�[�C�� : " + color);
	}
}
class Sentra extends Car {							// �~��Car���O
	public void SentraShow() {						// Sentra���O�ۦ���k
		Engine sentraEngine = new Engine();			// Composition
		sentraEngine.starting();					// �����Ұ�
		sentraEngine.running();						// �����B��
		sentraEngine.stopping();					// ��������
	}
}
class Engine {										// �OSentra���O���ݩ�
	public void starting() {						// Engine���O�ۦ���k
		System.out.println("�����Ұ�");
	}
	public void running() {							// Engine���O�ۦ���k
		System.out.println("�����B��");
	}
	public void stopping() {						// Eigine���O�ۦ���k
		System.out.println("��������");
	}
}
public class ch14_18 {
	public static void main(String[] args) {
		Sentra sentra = new Sentra();		
		sentra.setMaxSpeed(220);					// �ϥ��~��Car��k
		sentra.setColor("�Ŧ�");					// �ϥ��~��Car��k
		sentra.printCarInfo();						// �~��Car��k�C�L��T
		sentra.SentraShow();						// �i�ܤ����B�@
	}
}

