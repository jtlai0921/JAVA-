import javax.swing.*;								// �פJ���O�w
import java.awt.*;		
import java.awt.event.*;								
public class ch29_25 {	
	static JFrame jfrm = new JFrame("ch29_25");
	static Container ct  = jfrm.getContentPane();	// ���o���e���檫��
	static JTextArea ta = new JTextArea();			// �إߤ�r���
	static JLabel lab = new JLabel("�r�ƻP�r����"); // �إ߼��Ҳέp��T
	static JButton btn = new JButton("Count");		// �إ߫��s
// ����ƥ��ť�̩M�֦��ƥ�B�z��
	static class myListener implements ActionListener{	// �������O
		public void actionPerformed(ActionEvent e) {	// �ƥ�B�z��
			String text = ta.getText();
			String[] words = text.split("\\s");			// �ťդ��Υy�l
			lab.setText("�r�� : " + words.length + "  �r���� : " + text.length());		
		}
	}	
	public static void main(String[] args) {
		ct.setLayout(null);							// ���]�����t�m
// �]�w����b������m		
		lab.setBounds(50,30,200,20);				
		ta.setBounds(20,70,280,160);
		btn.setBounds(100,260,100,25);		
// �N�����J���e����		
		ct.add(ta);								
		ct.add(lab);
		ct.add(btn);
// ������U
		btn.addActionListener(new myListener());	// --- ���U
// �]�w�����j�p�M�i�H��ܻP�����{��					
		jfrm.setSize(350,350);						// �e350, ��350
		jfrm.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm.setVisible(true);						// ��ܵ���
	}
}

