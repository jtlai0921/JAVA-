import java.awt.*;								// �פJ���O�w
public class ch26_18 {	
	static Frame frm = new Frame("ch26_18");		
	public static void main(String[] args) {
		CardLayout obj =  new CardLayout(50,30);	
		frm.setLayout(obj);						// �]�w�����t�m�覡
		frm.setSize(300, 200);					// �e300, ��200
		frm.add(new Button("�ڬO���s 1"), "b1");
		frm.add(new Button("�ڬO���s 2"), "b2");
		frm.add(new Button("�ڬO���s 3"), "b3");
		obj.show(frm, "b3");					// ��ܫ��s3
		frm.setVisible(true);					// ��ܵ���		
	}
}

