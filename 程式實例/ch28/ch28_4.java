import java.awt.*;							// �פJ���O�w
public class ch28_4 {	
	static Frame frm = new Frame("ch28_4");
	static Choice ch = new Choice();
	public static void main(String[] args) {
		frm.setLayout(null);				// ���]�����t�m
		frm.setSize(200, 160);				// �e200, ��160
		ch.setBounds(50, 50, 100, 60);		// ����m�P�j�p
		ch.add("���Ӭ�j");					// �N���إ[�J���
		ch.add("�x�W��j");
		ch.add("�x�W�j��");
		ch.add("�M�ؤj��");
		ch.add("�����j��");
		ch.select(0);						// ���index 0����
		frm.add(ch);						// �N���[�J����
		frm.setVisible(true);				// ��ܵ���
	}
}

