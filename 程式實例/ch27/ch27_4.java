import java.awt.*;									// �פJ���O�w
import java.awt.event.*;							// �]����ActionEvent���O
public class ch27_4 {	
	static Frame frm = new Frame("ch27_4");
	static Button btn1 = new Button("����");
	static Button btn2 = new Button("���");
	static Button btn3 = new Button("����");
// ����ƥ��ť�̩M�֦��ƥ�B�z��
	static class myListener implements ActionListener{	// �������O
		public void actionPerformed(ActionEvent e) {	// �ƥ�B�z��
			String str = e.getActionCommand();			// ���o�ҫ�����W��
			if (str.equals("����"))
				frm.setBackground(Color.yellow);		// �I����e����
			else if(str.equals("���"))
				frm.setBackground(Color.green);			// �I����e����
			else
				System.exit(0);							// �{��������������
		}
	}
	public static void main(String[] args) {
		frm.setLayout(new FlowLayout());				// �y�ʦ������t�m
		frm.setSize(200, 120);							// �e200, ��120
		btn1.addActionListener(new myListener());		// --- ���U
		btn2.addActionListener(new myListener());		// --- ���U
		btn3.addActionListener(new myListener());		// --- ���U
		frm.add(btn1);									// �N����s�[�J����	
		frm.add(btn2);									// �N���s�[�J����
		frm.add(btn3);									// �N�����s�[�J����
		frm.setVisible(true);							// ��ܵ���	
	}	
}

