import java.awt.*;									// �פJ���O�w
import javax.swing.*;
public class ch30_11 extends JPanel {				// JPanel���O	
	public void paintComponent(Graphics g) {		// ø�Ϥ�k	
		super.paintComponent(g);					// �W�h�e���M��������e
		g.setColor(Color.LIGHT_GRAY);				// ø�s�L�Ǧ�
		g.draw3DRect(50,50,100,50,false);			// ���W
		g.draw3DRect(200,50,100,50,true);			// �~�Y		
	}	
	public static void main(String[] args) {
		JFrame frm = new JFrame("ch30_11");
		Container ct = frm.getContentPane();		// ���e����
		ct.add(new ch30_11(),BorderLayout.CENTER);	// �N�e�����J���e����
		frm.setSize(350, 200);						// �e350, ��200	
		frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
		frm.setVisible(true);						// ��ܵ���
	}
}

