import javax.swing.*;								// �פJ���O�w
import java.awt.*;										
public class ch29_16 {	
	static JFrame jfrm = new JFrame("ch29_16");
	static Container ct  = jfrm.getContentPane();	// ���o���e���檫��
	static JList<String> jlst = new JList<>();		// �إ�JList
	public static void main(String[] args) {
		ct.setLayout(new FlowLayout());				// �]�w�y�ʪ����t�m	
		String[] str = {"���Ӭ�j","�x�W��j","�x�_��j","�x�W�j��","�M�ؤj��"};
		jlst.setListData(str);						// �ϥΦr��}�Cstr�إߪ��
		jlst.setSelectedIndex(0);					// �]�w�w�]���
// �N�����J���e����		
		ct.add(jlst);								// ���
// �]�w�����j�p�M�i�H��ܻP�����{��					
		jfrm.setSize(200, 160);						// �e200, ��160
		jfrm.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm.setVisible(true);						// ��ܵ���
	}
}

