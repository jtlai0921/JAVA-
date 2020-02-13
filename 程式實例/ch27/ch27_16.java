import java.awt.*;										// �פJ���O�w
import java.awt.event.*;								// �]����Event
public class ch27_16 {	
	static Frame frm = new Frame("ch27_16");
// ����ƥ��ť�̩M�֦��ƥ�B�z��
	static class myListener implements WindowListener { // ��@WindowListener
		public void windowActivated(WindowEvent e) { 	// windowActivated�ƥ�B�z��
			System.out.println("windowActivated");
		}
		public void windowClosed(WindowEvent e) { 		// windowClosed�ƥ�B�z��
			System.out.println("windowClosed");	
		}
		public void windowClosing(WindowEvent e) { 		// windowClosing�ƥ�B�z��
			System.out.println("windowClosing");
			frm.dispose();								// ����frm�����귽�A��������
		}
		public void windowDeactivated(WindowEvent e) { 	// windowDeactivated�ƥ�B�z��
			System.out.println("windowDeactivated");
		}
		public void windowDeiconified(WindowEvent e) { 	// windowDeiconified�ƥ�B�z��
			System.out.println("windowDeiconified");
		}
		public void windowIconified(WindowEvent e) { 	// windowIconified�ƥ�B�z��
			System.out.println("windowIconified");
		}
		public void windowOpened(WindowEvent e) { 		// windowOpened�ƥ�B�z��
			System.out.println("windowOpened");
		}
	}
	public static void main(String[] args) {		
		frm.setLayout(null);							// ���]�����t�m
		frm.setSize(300, 160);							// �e300, ��160	
		frm.addWindowListener(new myListener());		// --- ���U		
		frm.setVisible(true);							// ��ܵ���	
	}	
}

