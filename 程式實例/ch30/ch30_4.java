import java.awt.*;									// �פJ���O�w
public class ch30_4 extends Frame {
	static ch30_4 frm = new ch30_4();			
	public void paint(Graphics g) {					// paint()��k		
		g.drawRect(50,100,200,100);					// ø�s�x��
	}	
	public static void main(String[] args) {
		frm.setTitle("ch30_4");						// �������D
		frm.setSize(300, 250);						// �e300, ��250	
		frm.setVisible(true);						// ��ܵ���
	}
}

