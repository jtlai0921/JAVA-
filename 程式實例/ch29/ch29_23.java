import javax.swing.*;								// �פJ���O�w
import java.awt.*;		
import java.awt.event.*;								
public class ch29_23 {	
	static JFrame jfrm = new JFrame("ch29_23");
	static Container ct  = jfrm.getContentPane();	// ���o���e���檫��
	static JTextField tf1 = new JTextField("�w��");	// �إߤ�r���
	static JTextField tf2 = new JTextField("�`��");	// �إߤ�r���
	static JButton btn = new JButton("Changed");	// �إ߫��s
// ����ƥ��ť�̩M�֦��ƥ�B�z��
	static class myListener implements ActionListener{	// �������O
		public void actionPerformed(ActionEvent e) {	// �ƥ�B�z��
			String str1 = tf1.getText();			// ���o��r���1���e
			String str2 = tf2.getText();			// ���o��r���2���e
			if (e.getSource() == btn) {
				tf1.setText(str2);					// �]�w��r���1���e
				tf2.setText(str1);					// �]�w��r���2���e
			}
		}
	}	
	public static void main(String[] args) {
		ct.setLayout(null);							// ���]�����t�m
// �]�w����b������m		
		tf1.setBounds(50,30,120,20);				
		tf2.setBounds(50,80,120,20);
		btn.setBounds(50,140,100,30);
// �N�����J���e����		
		ct.add(tf1);								
		ct.add(tf2);
		ct.add(btn);
// ������U
		btn.addActionListener(new myListener());	// --- ���U
// �]�w�����j�p�M�i�H��ܻP�����{��					
		jfrm.setSize(260,220);						// �e260, ��220
		jfrm.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm.setVisible(true);						// ��ܵ���
	}
}

