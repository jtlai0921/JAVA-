import java.awt.*;										// �פJ���O�w
import java.awt.event.*;								// �]����Event
public class ch27_12 {	
	static Frame frm = new Frame("ch27_12");
	static Label lab = new Label();						// ����
	static Button btn = new Button("Click Me");			// ���s
// ����ƥ��ť�̩M�֦��ƥ�B�z��
	static class myListener implements MouseListener{	// ��@MouseListener
		public void mouseClicked(MouseEvent e) { 		// mouseClicked�ƥ�B�z��
			lab.setText("Mouse Clicked");
		}
		public void mouseEntered(MouseEvent e) { 		// mouseEntered�ƥ�B�z��
			lab.setText("Mouse Entered");
		}
		public void mouseExited(MouseEvent e) {			// mouseExited�ƥ�B�z��
			lab.setText("Mouse Exited");
		}
		public void mousePressed(MouseEvent e) { 		// mousePressed�ƥ�B�z��
			lab.setText("Mouse Pressed");
		}
		public void mouseReleased(MouseEvent e) { 		// mouseReleased�ƥ�B�z��
			lab.setText("Mouse Released");
		}
	}
	public static void main(String[] args) {		
		frm.setLayout(null);							// ���]�����t�m
		frm.setSize(300, 160);							// �e300, ��160	
		lab.setBounds(30,50, 200, 20);					// ���Ҧ�m�P�j�p			
		btn.setBounds(120, 120, 60, 20);				// ���s��m�P�j�p
		btn.addMouseListener(new myListener());			// --- ���U	
		frm.add(lab);									// �Nlab�[�J����	
		frm.add(btn);									// �Nbtn�[�J����		
		frm.setVisible(true);							// ��ܵ���	
	}	
}

