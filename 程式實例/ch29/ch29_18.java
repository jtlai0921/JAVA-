import javax.swing.*;								// �פJ���O�w
import java.awt.*;										
public class ch29_18 {	
	static JFrame jfrm = new JFrame("ch29_18");
	static Container ct  = jfrm.getContentPane();	// ���o���e���檫��
	static JList<String> jlst = new JList<>();		// ��檫��
	public static void main(String[] args) {
		ct.setLayout(new FlowLayout());				// �]�w�y�ʪ����t�m	
		DefaultListModel<String> lst = new DefaultListModel<>();
		lst.addElement("���Ӭ�j");
		lst.addElement("�x�W��j");
		lst.addElement("�x�_��j");
		lst.addElement("�x�W�j��");
		lst.addElement("�M�ؤj��");
		lst.addElement("������j");
		lst.addElement("���L��j");
		lst.addElement("�����j");
		lst.addElement("��q�j��");
		lst.addElement("�����j��");
		jlst = new JList<>(lst);					// �إߪ��
		jlst.setSelectedIndex(0);					// �]�w�w�]���
// �N�����J���e����		
		ct.add(new JScrollPane(jlst));				// ���W�[���b
// �]�w�����j�p�M�i�H��ܻP�����{��					
		jfrm.setSize(300, 220);						// �e300, ��220
		jfrm.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm.setVisible(true);						// ��ܵ���
	}
}

