import java.awt.*;										// �פJ���O�w
import java.awt.event.*;								// �]����ActionEvent
public class ch27_8 {	
	static Frame frm = new Frame("ch27_8");
	static TextField tf1 = new TextField();				// �إ�TextField 1
	static TextField tf2 = new TextField();				// �إ�TextField 2
	static TextField tf3 = new TextField();				// �إ�TextField 3
	static Button btnPlus = new Button("+");			// �إߥ[�kbutton
	static Button btnMinus = new Button("-");			// �إߴ�kbutton
// ����ƥ��ť�̩M�֦��ƥ�B�z��
	static class myListener implements ActionListener{	// ��@ActionListener
		public void actionPerformed(ActionEvent e) {		// �ƥ�B�z��
			String str1 = tf1.getText();				// Ū���Ĥ@�ӼƦr
			String str2 = tf2.getText();				// Ū���ĤG�ӼƦr
			int x = Integer.parseInt(str1);				// �ѪR���
			int y = Integer.parseInt(str2);				// �ѪR���
			int result = 0;
			if (e.getSource() == btnPlus)				// �ˬd�O�_���[�k�s
				result = x + y;							// ����[�k
			else if(e.getSource() == btnMinus)			// �ˬd�O�_����k�s
				result = x - y;							// �����k
			tf3.setText(String.valueOf(result));		// �g�J���G
		}
	}
	public static void main(String[] args) {		
		frm.setLayout(null);							// ���ϥΪ����t�m
		frm.setSize(350, 280);							// �e350, ��280	
		tf1.setBounds(100, 50, 150, 20);				// �]�w��r�����m
		tf2.setBounds(100, 100, 150, 20);
		tf3.setBounds(100, 150, 150, 20);
		btnPlus.setBounds(100, 200, 60, 60);			// �]�w���s��m
		btnMinus.setBounds(190, 200, 60, 60);
		btnMinus.addActionListener(new myListener());	// --- ���U
		btnPlus.addActionListener(new myListener());	// --- ���U	
		tf3.setBackground(Color.yellow);				// ��r�I���O����		
		frm.add(tf1);frm.add(tf2);frm.add(tf3);			// �N3�Ӥ�r����[�J����	
		frm.add(btnMinus);frm.add(btnPlus);				// �N2�ӫ��s�[�J����
		frm.setVisible(true);							// ��ܵ���	
	}	
}

