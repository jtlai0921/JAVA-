import java.awt.*;									// �פJ���O�w
public class ch28_9 {	
	static Frame frm = new Frame("ch28_9");		
	static Scrollbar scv = new Scrollbar();			// �إ߫������b
	static Scrollbar sch = new Scrollbar(Scrollbar.HORIZONTAL); //����
	public static void main(String[] args) {
		frm.setLayout(null);						// ���]�����t�m
		scv.setBounds(50,50,15,100);				// �������b��m�P�j�p			
		sch.setBounds(100,75,100,15);				// �������b��m�P�j�p
		frm.add(scv);								// �������b�[�J����
		frm.add(sch);								// �������b�[�J����
		frm.setSize(250, 180);						// �e250, ��180
		frm.setVisible(true);						// ��ܵ���
	}
}

