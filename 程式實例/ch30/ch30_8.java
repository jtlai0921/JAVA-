import java.awt.*;									// �פJ���O�w
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
public class ch30_8 extends JPanel {				// JPanel���O			
	public void paintComponent(Graphics g) {		// ø�Ϥ�k	
		super.paintComponent(g);					// �W�h�e���M��������e
		Random ran = new Random();					// �H���ƪ���
		for ( int i = 0; i < 50; i++ ) {
			int x1 = ran.nextInt(620);				// (x1,y1)�O�x�Υ��W���y��
			int y1 = ran.nextInt(420);
			int x2 = ran.nextInt(620);				// (x1,y1)�O�x�Υk�U���y��
			int y2 = ran.nextInt(420);
			if (x1 > x2) {
				int tmp = x1; x1 = x2; x2 = tmp;
			}
			if (y1 > y2) {
				int tmp = y1; y1 = y2; y2 = tmp;
			}
			g.drawRect(x1,y1,(x2-x1),(y2-y1));		// ø�s�x��
		}	
	}	
	public static void main(String[] args) {
		JFrame frm = new JFrame("ch30_8");
		Container ct = frm.getContentPane();		// ���e����
		ct.add(new ch30_8());						// �N�e�����J���e����
		frm.setSize(640, 480);						// �e640, ��480	
		frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
		frm.setVisible(true);						// ��ܵ���
	}
}

