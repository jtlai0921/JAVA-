import java.awt.*;									// �פJ���O�w
public class ch28_6 {	
	static Frame frm = new Frame("ch28_6");
	static MenuBar mb = new MenuBar();				// �إ�MenuBar
	static Menu menu1 = new Menu("File");			// �إ�Menu
	static Menu menu2 = new Menu("Edit");			// �إ�Menu
	static MenuItem mI1_1 = new MenuItem("New");	// �إ�MenuItem
	static MenuItem mI1_2 = new MenuItem("Save");	// �إ�MenuItem
	static MenuItem mI1_3 = new MenuItem("Exit");	// �إ�MenuItem
	static MenuItem mI2_1 = new MenuItem("Copy");	// �إ�MenuItem
	static MenuItem mI2_2 = new MenuItem("Paste");	// �إ�MenuItem
	public static void main(String[] args) {
		mb.add(menu1);						// �bMenuBar�[�JFile Menu
		mb.add(menu2);						// �bMenuBar�[�JEdit Menu
		menu1.add(mI1_1);					// �NNew�[�JFile Menu		
		menu1.add(mI1_2);					// �NSave�[�JFile Menu
		menu1.addSeparator();				// �W�[���j�u
		menu1.add(mI1_3);					// �NExit�[�JFile Menu
		menu2.add(mI2_1);					// �NCopy�[�JEdit Menu
		menu2.add(mI2_2);					// �NPaste�[�JEdit Menu
		frm.setSize(200, 160);				// �e200, ��160
		frm.setMenuBar(mb);					// �]�wfrm�\���Omb����
		frm.setVisible(true);				// ��ܵ���
	}
}

