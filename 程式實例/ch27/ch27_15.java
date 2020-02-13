import java.awt.*;										// �פJ���O�w
import java.awt.event.*;								// �]����Event
public class ch27_15 {	
	static Frame frm = new Frame("ch27_15");
	static Label xlab = new Label();					// ���Ҭ���x�b
	static Label ylab = new Label();					// ���Ҭ���y�b
	static Label lab = new Label();						// �����ƥ�
// ����ƥ��ť�̩M�֦��ƥ�B�z��
	static class myListener extends MouseMotionAdapter{	// ��@MouseMotionAdapter
		public void mouseDragged(MouseEvent e) { 		// mouseDragged�ƥ�B�z��
			xlab.setText("x = " + e.getX());			// ��Xx�y��
			ylab.setText("y = " + e.getY());			// ��Xy�y��
			lab.setText("Mouse Dragged");				// ��X�ƹ��Q�즲
		}
	}
	public static void main(String[] args) {		
		frm.setLayout(null);							// ���]�����t�m
		frm.setSize(200, 160);							// �e200, ��160	
		xlab.setBounds(40, 50, 50, 20);					// xlab��m�M�j�p
		ylab.setBounds(120, 50, 50, 20);				// ylab��m�M�j�p
		lab.setBounds(50, 120, 100, 20);				// lab��m�M�j�p
		frm.add(xlab);									// �Nxlab�[�J����
		frm.add(ylab);									// �Nylab�[�J����
		frm.add(lab);									// �Nlab�[�J����
		frm.addMouseMotionListener(new myListener());	// --- ���U		
		frm.setVisible(true);							// ��ܵ���	
	}	
}

