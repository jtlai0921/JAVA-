import javax.swing.*;								// �פJ���O�w
import java.awt.*;	
import java.util.*;
import java.awt.event.*;									
public class ch29_20 {	
	static JFrame jfrm = new JFrame("ch29_20");
	static Container ct  = jfrm.getContentPane();	// ���o���e���檫��
	static JList<String> jlst1 = new JList<>();		// ��檫��1
	static JList<String> jlst2 = new JList<>();		// ��檫��2
	static Vector<String> vector = new Vector<String>(); // ���2������
// ����ƥ��ť�̩M�֦��ƥ�B�z��
	static class myListener extends MouseAdapter{	// �������O
		public void mouseClicked(MouseEvent e) {	// �ƥ�B�z��
			if (e.getSource() == jlst1)
				if (e.getClickCount() == 2) {		// �s��2��
					vector.add(jlst1.getSelectedValue());	// ���o�ﶵ
					jlst2.setListData(vector);				// �]�w���2
				}
		}
	}		
	public static void main(String[] args) {
		ct.setLayout(new GridLayout());				// �]�w��檩���t�m	
		DefaultListModel<String> lst1 = new DefaultListModel<>();
		lst1.addElement("���Ӭ�j");
		lst1.addElement("�x�W��j");
		lst1.addElement("�x�_��j");
		lst1.addElement("�x�W�j��");
		lst1.addElement("�M�ؤj��");
		lst1.addElement("������j");
		lst1.addElement("���L��j");
		jlst1 = new JList<>(lst1);					// �إߪ��
// �N�����J���e����		
		ct.add(new JScrollPane(jlst1));				// ���1�W�[���b
		ct.add(new JScrollPane(jlst2));				// ���2
// ���U��ť��
		jlst1.addMouseListener(new myListener());	// ���U
// �]�w�����j�p�M�i�H��ܻP�����{��					
		jfrm.setSize(300, 160);						// �e300, ��220
		jfrm.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm.setVisible(true);						// ��ܵ���
	}
}

