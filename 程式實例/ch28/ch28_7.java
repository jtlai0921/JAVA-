import java.awt.*;									// �פJ���O�w
public class ch28_7 {	
	static Frame frm = new Frame("ch28_7");
	static MenuBar mb = new MenuBar();				// �إ�MenuBar
	static Menu menu = new Menu("File");			// �إ�Menu
	static Menu submenu = new Menu("Edit");			// �إ�SubMenu
	static MenuItem mI1 = new MenuItem("New");		// �إ�MenuItem
	static MenuItem mI2 = new MenuItem("Save");		// �إ�MenuItem
	static MenuItem mI3 = new MenuItem("Exit");		// �إ�MenuItem
	static MenuItem smI1 = new MenuItem("Copy");	// �إ�MenuItem
	static MenuItem smI2 = new MenuItem("Paste");	// �إ�MenuItem
	public static void main(String[] args) {
		mb.add(menu);						// �bMenuBar�[�JFile Menu
		menu.add(mI1);						// �NNew�[�JFile Menu		
		menu.add(mI2);						// �NSave�[�JFile Menu
		menu.addSeparator();				// �W�[���j�u
		menu.add(submenu);					// �W�[submenu Edit
		menu.addSeparator();				// �W�[���j�u
		menu.add(mI3);						// �NExit�[�JFile Menu
		submenu.add(smI1);					// �NCopy�[�JEdit SubMenu
		submenu.add(smI2);					// �NPaste�[�JEdit SubMenu
		frm.setSize(200, 160);				// �e200, ��160
		frm.setMenuBar(mb);					// �]�wfrm�\���Omb����
		frm.setVisible(true);				// ��ܵ���
	}
}

