import javax.swing.*;								// �פJ���O�w
import java.awt.*;
import java.awt.event.*;										
public class ch29_15 {	
	static JFrame jfrm = new JFrame("ch29_15");
	static Container ct  = jfrm.getContentPane();	// ���o���e���檫��
	static JRadioButton rb1 = new JRadioButton("�k��",true); // �w�q�ﶵ�s
	static JRadioButton rb2 = new JRadioButton("�k��");	  	 // �w�q�ﶵ�s
	static JButton btn = new JButton("Clicked");	// �w�q���s
// ����ƥ��ť�̩M�֦��ƥ�B�z��
	static class myListener implements ActionListener{	// �������O
		public void actionPerformed(ActionEvent e) {	// �ƥ�B�z��
			if (rb1.isSelected()) 					 
				JOptionPane.showMessageDialog(ct,"�A�O�k��");
			if (rb2.isSelected()) 					// �׵���
				JOptionPane.showMessageDialog(ct,"�p�O�k��");
		}
	}		
	public static void main(String[] args) {
		ct.setLayout(null);							// �]�w���Ϊ����t�m	
		ButtonGroup bg = new ButtonGroup();			// �إ߸s��
		bg.add(rb1);								// �ﶵ�s1��J�s��
		bg.add(rb2);								// �ﶵ�s2��J�s��
// �]�w����
		rb1.setBounds(100,50,100,20);
		rb2.setBounds(100,100,100,20);
		btn.setBounds(100,150,80,20);
// �N�����J���e����		
		ct.add(rb1);								// �ﶵ�s
		ct.add(rb2);								// �ﶵ�s
		ct.add(btn);								// ���s
// ������U
		btn.addActionListener(new myListener());	// --- ���U	
// �]�w�����j�p�M�i�H��ܻP�����{��					
		jfrm.setSize(300, 260);						// �e300, ��260
		jfrm.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm.setVisible(true);						// ��ܵ���
	}
}

