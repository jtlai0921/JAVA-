import java.awt.*;									// �פJ���O�w
import javax.swing.*;
import java.awt.geom.*;
public class ch30_13_1 extends JPanel {				// JPanel���O	
	private Image bgImage = Toolkit.getDefaultToolkit().getImage("star.gif");
	public void paintComponent(Graphics g) {		// ø�Ϥ�k	
		super.paintComponent(g);					// �W�h�e���M��������e
		Graphics2D g2d = (Graphics2D) g;							
		g2d.drawImage(bgImage,0,0,this);			// �Ĥ@���Ϥ����J
// �Ϲ��첾
		AffineTransform transform = new AffineTransform();	// �w�q����
		int bgImageWidth = bgImage.getWidth(this);			// �Ϫ��e
		int bgImageHeight = bgImage.getHeight(this);		// �Ϫ���
		int x = 100;
		int y = 100;
		transform.translate(x-bgImageWidth/2, y-bgImageHeight/2);
		g2d.drawImage(bgImage,transform,this);		// �ĤG���Ϥ����J
// �Ϲ��첾�P����
		for (int i = 0; i < 5; i++ ) {
			transform.translate(100,30);			// �첾
			transform.rotate(Math.toRadians(15),bgImageWidth/2,bgImageHeight/2);
			transform.scale(0.85,0.85);				// �Y�p��85%
			g2d.drawImage(bgImage,transform,this);	// �j��Ϥ����J
		}
	}	
	public static void main(String[] args) {
		JFrame frm = new JFrame("ch30_13_1");
		Container ct = frm.getContentPane();		// ���e����
		ct.add(new ch30_13_1(), BorderLayout.CENTER);	// �N�e�����J���e����
		frm.setSize(640, 400);						// �e640, ��400	
		frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
		frm.setVisible(true);						// ��ܵ���
	}
}

