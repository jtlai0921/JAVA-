import java.awt.*;									// �פJ���O�w
import javax.swing.*;
public class ch30_6 extends JPanel {				// JPanel���O			
	public void paintComponent(Graphics g) {		// ø�Ϥ�k	
		super.paintComponent(g);					// �W�h�e���M��������e
		g.drawRect(5,5,100,100);					// ø�s�x��
	}	
	public static void main(String[] args) {
		JFrame frm = new JFrame("ch30_6");
		Container ct = frm.getContentPane();		// ���e����
		ct.add(new ch30_6());						// �N�e�����J���e����
		frm.setSize(200, 160);						// �e200, ��160	
		frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
		frm.setVisible(true);						// ��ܵ���
// �C�X�e���e�׻P����
		System.out.println("�e���e�� : " + ct.getWidth());
		System.out.println("�e������ : " + ct.getHeight());
	}
}

