import java.awt.*;									// �פJ���O�w
import java.awt.event.*;							// �]����ActionEvent���O
public class ch27_2 {	
	static Frame frm = new Frame("ch27_2");
	static Button btn = new Button("�Ы���");
// ����ƥ��ť�̩M�֦��ƥ�B�z��
	static class MyListener implements ActionListener{	// �������O
		public void actionPerformed(ActionEvent e) {	// �ƥ�B�z��
			frm.setBackground(Color.gray);				// �I����e����
		}
	}
	public static void main(String[] args) {
		frm.setLayout(new FlowLayout());				// �y�ʦ������t�m
		frm.setSize(200, 120);							// �e200, ��120
		frm.setBackground(Color.yellow); 				// �����I���O����	
		btn.addActionListener(new MyListener());		// --- ���U
		frm.add(btn);									// �N�\��s�[�J����						
		frm.setVisible(true);							// ��ܵ���	
	}	
}

