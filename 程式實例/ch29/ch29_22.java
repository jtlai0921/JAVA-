import javax.swing.*;								// �פJ���O�w
import java.awt.*;										
public class ch29_22 {	
	static JFrame jfrm = new JFrame("ch29_22");
	static Container ct  = jfrm.getContentPane();	// ���o���e���檫��
	static JTextField tf1 = new JTextField("�w��");	// �إߤ�r���
	static JTextField tf2 = new JTextField("�`��");	// �إߤ�r���
	public static void main(String[] args) {
		ct.setLayout(null);							// ���]�����t�m	
		tf1.setBounds(50,30,100,20);
		tf2.setBounds(50,80,100,20);
// �N�����J���e����		
		ct.add(tf1);								
		ct.add(tf2);
// �]�w�����j�p�M�i�H��ܻP�����{��					
		jfrm.setSize(260,200);						// �e260, ��200
		jfrm.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm.setVisible(true);						// ��ܵ���
	}
}

