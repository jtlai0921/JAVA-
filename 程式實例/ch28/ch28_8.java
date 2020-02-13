import java.awt.*;										// �פJ���O�w
import java.awt.event.*;								// �]����Event
public class ch28_8 {	
	static Frame frm = new Frame("ch28_8");
	static MenuBar mb = new MenuBar();					// �إ�MenuBar
	static Menu menu = new Menu("Font");				// �إ�Menu Font
	static MenuItem mI1 = new MenuItem("Bold");			// �إ�MenuItem
	static MenuItem mI2 = new MenuItem("Italic");		// �إ�MenuItem
	static MenuItem mI3 = new MenuItem("Plain");		// �إ�MenuItem
	static MenuItem mI4 = new MenuItem("Exit");			// �إ�MenuItem
	static Label lab = new Label("Java",Label.CENTER);	// �إ�Label
// ����ƥ��ť�̩M�֦��ƥ�B�z��
	static class myListener implements ActionListener{	// �������O
		public void actionPerformed(ActionEvent e) {	// �ƥ�B�z��
			MenuItem item = (MenuItem) e.getSource();	// ���o�ҫ��ﶵ
			if (item == mI1)							// �p�Gtrue�إ�BOLD
				lab.setFont(new Font("Times New Roman",Font.BOLD,36));		
			else if (item == mI2)						// �p�Gtrue�إ�ITALIC
				lab.setFont(new Font("Times New Roman",Font.ITALIC,36));			
			else if (item == mI3)						// �p�Gtrue�إ�PLAIN
				lab.setFont(new Font("Times New Roman",Font.PLAIN,36));			
			else if (item == mI4)
				frm.dispose();							// ��������
		}
	}
	public static void main(String[] args) {
		mb.add(menu);									// �bMenuBar�[�JFile Menu
		menu.add(mI1);									// �NBold�[�JFile Menu		
		menu.add(mI2);									// �NItalic�[�JFile Menu
		menu.add(mI3);									// �NPlain�[�JFile Menu
		menu.addSeparator();							// �W�[���j�u
		menu.add(mI4);									// �NExit�[�JFile Menu	
		mI1.addActionListener(new myListener());		// --- ���U
		mI2.addActionListener(new myListener());		// --- ���U
		mI3.addActionListener(new myListener());		// --- ���U
		mI4.addActionListener(new myListener());		// --- ���U	
		lab.setFont(new Font("Times New Roman",Font.PLAIN,36));		
		frm.add(lab);									// �NLabel�[�J����
		frm.setSize(250, 160);							// �e250, ��160
		frm.setMenuBar(mb);								// �]�wfrm�\���Omb����
		frm.setVisible(true);							// ��ܵ���
	}
}

