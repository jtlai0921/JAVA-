import javax.swing.*;						// �פJ���O�w									
public class ch29_27 {	
	static JFrame frm = new JFrame("ch29_27");
	static JTextArea ta = new JTextArea(200,200);
	static JTabbedPane tp = new JTabbedPane();
	static JPanel p1 = new JPanel();
	static JPanel p2 = new JPanel();
	static JPanel p3 = new JPanel();
	public static void main(String[] args) {
		frm.setLayout(null);				// ���]�����t�m	
		tp.setBounds(50,50,200,200);
		p1.add(ta);							// ��r�ϩ�JJpanel
		tp.add("�ӤH�Ǿ�", p1);				// JPanel��JJTabbedPane
		tp.add("�g��", p2);					// JPane2��JJTabbedPane
		tp.add("�ۧ@", p3);					// JPane3��JJTabbedPane
		frm.add(tp);						// �NJTabbedPane��JFrame
// �]�w�����j�p�M�i�H��ܻP�����{��					
		frm.setSize(350,350);				// �e350, ��350
		frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
		frm.setVisible(true);				// ��ܵ���
	}
}

