import java.awt.*;									// �פJ���O�w
import java.awt.event.*;							// �]����Event
public class ch28_11 {	
	static Frame frm = new Frame("ch28_11");		
	static Button btn1 = new Button("Demo");		
	static Button btn2 = new Button("Exit");
	static Dialog dialog = new Dialog(frm,"MyDialog");		
	static Label lab = new Label("�w��ϥι�ܤ��");
// ����ƥ��ť�̩M�֦��ƥ�B�z��
	static class myListener implements ActionListener{		
		public void actionPerformed(ActionEvent e) {
			Button btn = (Button) e.getSource( );
			if (btn == btn1) {						// �������s�Q��
				dialog.setLayout(null);				// ���]�w�����t�m	
				dialog.setSize(150,120);			// ��ܤ���j�p		
				lab.setBounds(35,50,150,20);		// ���Ҧ�m�P�j�p
				dialog.add(lab);					// ���ҥ[�J��ܤ��
				btn2.setBounds(70,80,30,20);		// ���s��m�P�j�p
				dialog.add(btn2);					// ���s�[�J��ܤ��
				dialog.setVisible(true);			// ��ܹ�ܤ��
			}
			else if (btn == btn2) {					// ��ܤ�����s�Q��		
				dialog.setVisible(false);			// ���ù�ܤ��
			}
		}
	}
	public static void main(String[] args) {
		frm.setLayout(new FlowLayout());			// �]�w�����t�m		
		btn1.addActionListener(new myListener()); 	// ���U
		btn2.addActionListener(new myListener()); 	// ���U									
		frm.add(btn1);								// ���s�[�J����
		frm.setSize(200, 150);						// �e200, ��150
		frm.setVisible(true);						// ��ܵ���
	}
}

