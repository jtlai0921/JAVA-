import javax.swing.*;								// �פJ���O�w
import java.awt.*;										
public class ch29_24 {	
	static JFrame jfrm = new JFrame("ch29_24");
	static Container ct  = jfrm.getContentPane();	// ���o���e���檫��
	static JTextArea ta = new JTextArea("�w����{");// �إߤ�r��
	public static void main(String[] args) {
		ct.setLayout(null);							// ���]�����t�m	
		ta.setBounds(20,30,240,160);
// �N�����J���e����		
		ct.add(ta);								
// �]�w�����j�p�M�i�H��ܻP�����{��					
		jfrm.setSize(300,260);						// �e300, ��260
		jfrm.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm.setVisible(true);						// ��ܵ���
	}
}

