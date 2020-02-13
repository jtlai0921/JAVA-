import java.awt.*;									// �פJ���O�w
import javax.swing.*;
import java.awt.geom.*;
public class ch30_13 extends JPanel {				// JPanel���O	
	public void paintComponent(Graphics g) {		// ø�Ϥ�k	
		Graphics2D g2d = (Graphics2D) g;
		super.paintComponent(g);					// �W�h�e���M��������e
		g2d.setColor(Color.red);					// ����
		Stroke stroke = new BasicStroke(3f);		// �x�νu���e��3f
		g2d.setStroke(stroke);
		g2d.drawRect(20,20,300,120);
		
		g2d.setColor(Color.green);					// ���
		g2d.setStroke(new BasicStroke(6f));			// �x�νu���e��6f
		g2d.draw(new Rectangle2D.Float(50.0f,50.0f,240.0f,60.0f));
		
		g2d.setColor(Color.blue);					// �Ŧ�
		g2d.setStroke(new BasicStroke(9f));			// �x�νu���e��9f
		g2d.draw(new Rectangle2D.Double(70.0d,70.0d,190.0d,20.0d));		
	}	
	public static void main(String[] args) {
		JFrame frm = new JFrame("ch30_13");
		Container ct = frm.getContentPane();		// ���e����
		ct.add(new ch30_13(),BorderLayout.CENTER);	// �N�e�����J���e����
		frm.setSize(350, 200);						// �e350, ��200	
		frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
		frm.setVisible(true);						// ��ܵ���
	}
}

