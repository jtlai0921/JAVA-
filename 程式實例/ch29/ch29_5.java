import javax.swing.*;									// �פJ���O�w
import java.awt.*;	
import java.awt.event.*;									
public class ch29_5 {	
	static JFrame jfrm = new JFrame("ch29_5");
	static JButton btn = new JButton("Yellow");
	static Container ct  = jfrm.getContentPane();		// ���o���e���檫��
// ����ƥ��ť�̩M�֦��ƥ�B�z��
	static class myListener implements ActionListener{	// �������O
		public void actionPerformed(ActionEvent e) {	// �ƥ�B�z��
			ct.setBackground(Color.yellow);				// �I����e����
		}
	}
	public static void main(String[] args) {
		ct.setLayout(new FlowLayout());					// �]�w�y�ʪ����t�m
		ct.add(btn);									// �b���e����إ߫��s
		btn.addActionListener(new myListener());		// --- ���U
		ct.setBackground(Color.green);					// ���e���橳��O���
		jfrm.setSize(200, 160);							// �e200, ��160
		jfrm.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm.setVisible(true);							// ��ܵ���
	}
}

