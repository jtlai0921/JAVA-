import java.awt.*;									// �פJ���O�w
import java.awt.event.*;
public class ch30_15 extends Frame implements MouseListener, MouseMotionListener {
	static ch30_15 frm = new ch30_15();		
	static int x1,y1,x2,y2;
	public void mouseDragged(MouseEvent e) {		// �ƥ�B�z��
		Graphics g = getGraphics();					// ���oø�ϰϪ���g
		x2 = e.getX();								// ���o�즲�ƹ���x�y��
		y2 = e.getY();								// ���o�즲�ƹ���y�y��
		g.setColor(Color.blue);						// �]�wø�s�Ŧ�u��
		g.drawLine(x1,y1,x2,y2);					// ø�s�u��
		x1 = x2;									// ��sx1�y��
		y1 = y2;									// ��sy1�y��
	}
	public void mousePressed(MouseEvent e) {					
		x1 = e.getX();								// ���o�ƹ����U��x�y��
		y1 = e.getY();								// ���o�ƹ����U��y�y��
	}	
	public void mouseMoved(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mouseClicked(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public static void main(String[] args) {
		frm.setTitle("ch30_15");					// �������D
		frm.setSize(300, 250);						// �e300, ��250
		frm.addMouseListener(frm);					// ���U			
		frm.addMouseMotionListener(frm);			// ���U
		frm.setVisible(true);						// ��ܵ���
	}
}

