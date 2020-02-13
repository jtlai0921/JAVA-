import java.awt.*;										// �פJ���O�w
import java.awt.event.*;								// �]����Event
public class ch27_9 {	
	static Frame frm = new Frame("ch27_9");
	static Label lab = new Label();						// ����
	static TextArea ta = new TextArea();				// ��r�϶�
// ����ƥ��ť�̩M�֦��ƥ�B�z��
	static class myListener implements KeyListener{		// ��@KeyListener
		public void keyPressed(KeyEvent e) {			// KeyPressed�ƥ�B�z��
			lab.setText("Key Pressed");					// ��XKey Pressed
		}
		public void keyReleased(KeyEvent e) {			// KeyReleased�ƥ�B�z��
			lab.setText("Key Released");				// ��XKey Released
		}
		public void keyTyped(KeyEvent e) {				// KeyTyped�ƥ�B�z��
			lab.setText("Key Typed");					// ��XKey Typed
		}
	}
	public static void main(String[] args) {		
		frm.setLayout(null);							// ���]�����t�m
		frm.setSize(200, 160);							// �e200, ��160	
		lab.setBounds(30,50, 100, 20);					// ���Ҧ�m�P�j�p			
		ta.setBounds(30, 80, 140, 60);					// ��r�϶���m�P�j�p
		lab.addKeyListener(new myListener());			// --- ���U
		ta.addKeyListener(new myListener());			// --- ���U	
		frm.add(lab);									// �Nlab�[�J����	
		frm.add(ta);									// �Nta�[�J����		
		frm.setVisible(true);							// ��ܵ���	
	}	
}

