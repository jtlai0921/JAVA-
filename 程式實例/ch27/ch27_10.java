import java.awt.*;										// �פJ���O�w
import java.awt.event.*;								// �]����Event
public class ch27_10 {	
	static Frame frm = new Frame("ch27_10");
	static Label lab = new Label();						// ����
	static TextArea ta = new TextArea();				// ��r�϶�
// ����ƥ��ť�̩M�֦��ƥ�B�z��
	static class myListener implements KeyListener{		// ��@KeyListener
		public void keyPressed(KeyEvent e) {}			// KeyPressed�ƥ�B�z��
		public void keyReleased(KeyEvent e) {			// KeyReleased�ƥ�B�z��
			String text = ta.getText();
			String[] words = text.split("\\s");			// �ťդ��Υy�l
			lab.setText("�r�� : " + words.length + "  �r���� : " + text.length());
		}
		public void keyTyped(KeyEvent e) {}				// KeyTyped�ƥ�B�z��
	}
	public static void main(String[] args) {		
		frm.setLayout(null);							// ���]�����t�m
		frm.setSize(300, 160);							// �e300, ��160	
		lab.setBounds(30,50, 200, 20);					// ���Ҧ�m�P�j�p			
		ta.setBounds(30, 80, 240, 60);					// ��r�϶���m�P�j�p
		lab.addKeyListener(new myListener());			// --- ���U
		ta.addKeyListener(new myListener());			// --- ���U	
		frm.add(lab);									// �Nlab�[�J����	
		frm.add(ta);									// �Nta�[�J����		
		frm.setVisible(true);							// ��ܵ���	
	}	
}

