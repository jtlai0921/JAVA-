import javax.swing.*;								// �פJ���O�w
import java.awt.*;										
public class ch29_26 {	
	static JFrame jfrm = new JFrame("ch29_26");
	static Container ct  = jfrm.getContentPane();	// ���o���e���檫��
	static JPasswordField pwd = new JPasswordField();// �إߤ�r��
	static Label lab = new Label("Password : ");
	public static void main(String[] args) {
		ct.setLayout(null);							// ���]�����t�m	
		lab.setBounds(20,50,60,20);					// �K�X�楪�䪺����
		pwd.setBounds(85,50,100,20);				// �K�X��
// �N�����J���e����		
		ct.add(lab);
		ct.add(pwd);
// �]�w�����j�p�M�i�H��ܻP�����{��					
		jfrm.setSize(240,160);						// �e240, ��160
		jfrm.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm.setVisible(true);						// ��ܵ���
	}
}

