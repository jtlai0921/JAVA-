import java.awt.*;										// �פJ���O�w
import java.awt.event.*;								// �]����itemEvent
public class ch28_3 {	
	static Frame frm = new Frame("ch28_3");			
	static List lst = new List();						// �إ�List����lst
	static TextField tf = new TextField();				// �إ�TextField����tf
// ����ƥ��ť�̩M�֦��ƥ�B�z��
	static class myListener implements ItemListener{	// �������O
		public void itemStateChanged(ItemEvent e) {		// �ƥ�B�z��
			String str = lst.getSelectedItem();			// ���o�ҫ��ﶵ
			tf.setText(str);							// �N�ﶵ�[�Jtf
		}
	}
	public static void main(String[] args) {		
		frm.setLayout(new FlowLayout(FlowLayout.CENTER)); // �y�ʦ������t�m
		frm.setSize(200, 160);							// �e200, ��160	
		lst.add("���Ӭ�j");							// �N���إ[�J���
		lst.add("�x�W��j");
		lst.add("�x�W�j��");
		lst.add("�M�ؤj��");
		lst.add("�����j��");
		lst.select(0);									// ���index 0����
		lst.addItemListener(new myListener());			// --- ���U	
		tf.setText(lst.getSelectedItem());				// �C�X�̪�ҿﶵ��
		frm.add(tf);									// �Ntf�[�J����
		frm.add(lst);									// �Nlst�[�J����	
		frm.setVisible(true);							// ��ܵ���	
	}	
}

