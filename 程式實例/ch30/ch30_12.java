import java.awt.*;									// �פJ���O�w
import javax.swing.*;
import java.awt.geom.*;
public class ch30_12 extends JPanel {				// JPanel���O	
	public void paintComponent(Graphics g) {		// ø�Ϥ�k	
		Graphics2D g2d = (Graphics2D) g;
		super.paintComponent(g);					// �W�h�e���M��������e
		g2d.setColor(Color.red);					// ����
		Stroke stroke = new BasicStroke(3f);		// �u���e��3f
		g2d.setStroke(stroke);
		g2d.drawLine(50,30,250,30);
		
		g2d.setColor(Color.green);					// ���
		g2d.setStroke(new BasicStroke(6f));			// �u���e��6f
		g2d.draw(new Line2D.Float(50.0f,80.0f,250.0f,80.0f));
		
		g2d.setColor(Color.blue);					// �Ŧ�
		g2d.setStroke(new BasicStroke(9f));			// �u���e��9f
		g2d.draw(new Line2D.Double(50.0d,130.0d,250.0d,130.0d));				
	}	
	public static void main(String[] args) {
		JFrame frm = new JFrame("ch30_12");
		Container ct = frm.getContentPane();		// ���e����
		ct.add(new ch30_12(),BorderLayout.CENTER);	// �N�e�����J���e����
		frm.setSize(350, 200);						// �e350, ��200	
		frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
		frm.setVisible(true);						// ��ܵ���
	}
}

