import java.awt.*;							// �פJ���O�w
public class ch28_1 {	
	static Frame frm = new Frame("ch28_1");
	static List lst = new List();
	public static void main(String[] args) {
		frm.setLayout(null);				// ���]�����t�m
		frm.setSize(200, 160);				// �e200, ��160
		lst.setBounds(50, 50, 100, 60);		// ����m�P�j�p
		lst.add("���Ӭ�j");				// �N���إ[�J���
		lst.add("�x�W��j");
		lst.add("�x�W�j��");
		lst.add("�M�ؤj��");
		lst.add("�����j��");
		lst.select(0);						// ���index 0����
		frm.add(lst);						// �N���[�J����
		frm.setVisible(true);				// ��ܵ���
	}
}

