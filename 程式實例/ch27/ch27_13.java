import java.awt.*;										// �פJ���O�w
import java.awt.event.*;								// �]����Event
public class ch27_13 {	
	static Frame frm = new Frame("ch27_13");
// ����ƥ��ť�̩M�֦��ƥ�B�z��
	static class myListener extends MouseAdapter{		// �~��MouseAdapter
		public void mouseClicked(MouseEvent e) { 		// mouseClicked�ƥ�B�z��
			System.out.println("�y��" + e.getX() + "," + e.getY());
		}
	}
	public static void main(String[] args) {		
		frm.setLayout(null);							// ���]�����t�m
		frm.setSize(300, 160);							// �e300, ��160	
		frm.addMouseListener(new myListener());			// --- ���U		
		frm.setVisible(true);							// ��ܵ���	
	}	
}

