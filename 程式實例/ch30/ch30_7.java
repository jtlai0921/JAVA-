import java.awt.*;									// �פJ���O�w
import java.awt.event.*;
import javax.swing.*;
public class ch30_7 extends JPanel {				// JPanel���O			
	public void paintComponent(Graphics g) {		// ø�Ϥ�k	
		super.paintComponent(g);					// �W�h�e���M��������e
		setBackground(Color.white);					// �e���I���O�զ�
		g.setColor(Color.blue);						// �e���O���Ŧ�ø��
		g.setFont(new Font("Arial",Font.ITALIC,18));	// �r���]�w
		g.drawString("I love Java", 30, 30);		// �r��b(30,30)��X
		g.setFont(new Font("Old English Text MT",Font.BOLD,20));// �r���]�w
		g.drawString("I love Java", 150, 30);		// �r��b(150,30)��X
		g.fillRect(30,50,180,120);					// ø�s�x��
	}	
	public static void main(String[] args) {
		JFrame frm = new JFrame("ch30_7");
		Container ct = frm.getContentPane();		// ���e����
		ct.add(new ch30_7());						// �N�e�����J���e����
		frm.setSize(300, 250);						// �e200, ��160	
		frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
		frm.setVisible(true);						// ��ܵ���
	}
}

