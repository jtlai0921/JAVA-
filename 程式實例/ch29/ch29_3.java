import javax.swing.*;								// �פJ���O�w
import java.awt.*;										
public class ch29_3 {	
	static JFrame jfrm = new JFrame("ch29_3");
	static JButton btn = new JButton("OK");
	static Container ct  = jfrm.getContentPane();	// ���o���e���檫��
	public static void main(String[] args) {
		ct.add(btn);								// �b���e����إ߫��s	
		jfrm.setSize(200, 160);						// �e200, ��160
		jfrm.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm.setVisible(true);						// ��ܵ���
	}
}

