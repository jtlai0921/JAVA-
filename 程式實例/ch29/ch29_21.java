import javax.swing.*;								// �פJ���O�w
import java.awt.*;		
import java.awt.event.*;								
public class ch29_21 {	
	static JFrame jfrm = new JFrame("ch29_21");
	static Container ct  = jfrm.getContentPane();	// ���o���e���檫��
	static JButton btn = new JButton("My Color");	// �إ�My Color���s
	static JColorChooser jcc = new JColorChooser();	// �إ�jcc��m����
	static Color mycolor;							// �w�q��m
// ����ƥ��ť�̩M�֦��ƥ�B�z��
	static class myListener implements ActionListener{	// �������O
		public void actionPerformed(ActionEvent e) {	// �ƥ�B�z��
			mycolor = jcc.showDialog(jfrm,"Swing Color Chooser",Color.yellow);
			ct.setBackground(mycolor);				// �]�w���e����I��
		}
	}			
	public static void main(String[] args) {
		ct.setLayout(new BorderLayout());			// �]�w��ɪ����t�m				
// �N�����J���e����		
		ct.add(btn, BorderLayout.NORTH);			// ���s�b�U��
// ���U��ť��
		btn.addActionListener(new myListener());	// --- ���U
// �]�w�����j�p�M�i�H��ܻP�����{��					
		jfrm.setSize(200, 160);						// �e200, ��160
		jfrm.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm.setVisible(true);						// ��ܵ���
	}
}

