import javax.swing.*;							// �פJ���O�w
import java.awt.*;										
public class ch29_3_1 {	
	static JFrame jfrm = new JFrame("ch29_3_1");
	static JButton btn = new JButton("OK");
	public static void main(String[] args) {
		jfrm.add(btn);							// �bJFrame�إ߫��s	
		jfrm.setSize(200, 160);					// �e200, ��160
		jfrm.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm.setVisible(true);					// ��ܵ���
	}
}

