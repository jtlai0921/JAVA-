import java.awt.*;									// �פJ���O�w
import javax.swing.*;
public class ch30_9 extends JPanel {				// JPanel���O	
	private Image bgImage = Toolkit.getDefaultToolkit().getImage("snow.jpg");
	public void paintComponent(Graphics g) {		// ø�Ϥ�k	
		super.paintComponent(g);					// �W�h�e���M��������e
		g.drawImage(bgImage,0,0,this);				// �N�Ϥ����J	
	}	
	public static void main(String[] args) {
		JFrame frm = new JFrame("ch30_9");
		Container ct = frm.getContentPane();		// ���e����
		ct.add(new ch30_9(), BorderLayout.CENTER);	// �N�e�����J���e����
		frm.setSize(640, 480);						// �e640, ��480	
		frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
		frm.setVisible(true);						// ��ܵ���
	}
}

