import java.awt.*;										// �פJ���O�w
import java.awt.event.*;								// �]����itemEvent
public class ch28_5 {	
	static Frame frm = new Frame("ch28_5");			
	static Choice ch = new Choice();					// �إ�Choice����ch
// ����ƥ��ť�̩M�֦��ƥ�B�z��
	static class myListener implements ItemListener{	// �������O
		public void itemStateChanged(ItemEvent e) {		// �ƥ�B�z��
			String color = ch.getSelectedItem();		// ���o�ҫ��ﶵ
			if (color == "Yellow")
				frm.setBackground(Color.yellow);		// �]�I���O����
			else if (color == "Gray")
				frm.setBackground(Color.gray);			// �]�I���O�Ǧ�
			else if (color == "Green")
				frm.setBackground(Color.green);			// �]�I���O���
		}
	}
	public static void main(String[] args) {		
		frm.setLayout(new FlowLayout(FlowLayout.CENTER)); // �y�ʦ������t�m
		frm.setSize(200, 160);							// �e200, ��160	
		ch.add("Yellow");								// �N���إ[�J���
		ch.add("Gray");
		ch.add("Green");
		ch.select(0);									// ���index 0����
		frm.setBackground(Color.yellow);				// �w�]�I���O����
		ch.addItemListener(new myListener());			// --- ���U	
		frm.add(ch);									// �NChoice�[�J����	
		frm.setVisible(true);							// ��ܵ���	
	}	
}

