import javax.swing.*;								// �פJ���O�w
import java.awt.*;										
public class ch29_17 {	
	static JFrame jfrm = new JFrame("ch29_17");
	static Container ct  = jfrm.getContentPane();	// ���o���e���檫��
	static JList<String> jlst = new JList<>();
	public static void main(String[] args) {
		ct.setLayout(new FlowLayout());				// �]�w�y�ʪ����t�m	
		DefaultListModel<String> lst = new DefaultListModel<>();
		lst.addElement("���Ӭ�j");
		lst.addElement("�x�W��j");
		lst.addElement("�x�_��j");
		lst.addElement("�x�W�j��");
		lst.addElement("�M�ؤj��");
		jlst = new JList<>(lst);					// �إߪ��
		jlst.setSelectedIndex(0);					// �]�w�w�]���
// �N�����J���e����		
		ct.add(jlst);								// ���
// �]�w�����j�p�M�i�H��ܻP�����{��					
		jfrm.setSize(200, 160);						// �e200, ��160
		jfrm.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm.setVisible(true);						// ��ܵ���
	}
}

