import javax.swing.*;								// �פJ���O�w
import java.awt.*;										
public class ch29_6 {	
	static JFrame jfrm = new JFrame("ch29_6");
	static JButton btn = new JButton("OK");
	static Container ct  = jfrm.getContentPane();	// ���o���e���檫��
	static ImageIcon icon =  new ImageIcon("star.gif");
	static ImageIcon pressedIcon =  new ImageIcon("moon.gif");
	static ImageIcon rolloverIcon =  new ImageIcon("sun.gif");
	public static void main(String[] args) {
		ct.setLayout(new FlowLayout());				// �]�w�y�ʪ����t�m
		ct.add(btn);								// �b���e����إ߫��s
		btn.setIcon(icon);							// ���s��star.gif��	
		btn.setPressedIcon(pressedIcon);			// ���s��moon.gif��	
		btn.setRolloverIcon(rolloverIcon);			// ���s��sun.gif��	
		jfrm.setSize(200, 160);						// �e200, ��160
		jfrm.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm.setVisible(true);						// ��ܵ���
	}
}

