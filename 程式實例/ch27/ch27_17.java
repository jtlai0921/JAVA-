import java.awt.*;										// �פJ���O�w
import java.awt.event.*;								// �]����Event
public class ch27_17 {	
	static Frame frm = new Frame("ch27_17");
// ����ƥ��ť�̩M�֦��ƥ�B�z��
	static class myListener extends WindowAdapter { 	// �~��WindowAdapter
		public void windowClosing(WindowEvent e) { 		// windowClosing�ƥ�B�z��
			System.out.println("windowClosing");
			frm.dispose();								// ����frm�����귽�A��������
		}
	}
	public static void main(String[] args) {		
		frm.setLayout(null);							// ���]�����t�m
		frm.setSize(300, 160);							// �e300, ��160	
		frm.addWindowListener(new myListener());		// --- ���U		
		frm.setVisible(true);							// ��ܵ���	
	}	
}

