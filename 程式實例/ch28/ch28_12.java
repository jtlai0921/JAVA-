import java.awt.*;									// �פJ���O�w
import java.awt.event.*;							// �]����Event
import java.io.*;									// �ɮ�Ū��
public class ch28_12 {	
	static Frame frm = new Frame("ch28_12");
	static MenuBar mb = new MenuBar();				// �إ�MenuBar
	static Menu menu = new Menu("File");			// �إ�Menu		
	static MenuItem open = new MenuItem("Open");	// �إ�MenuItem
	static FileDialog fd = new FileDialog(frm,"�}���ɮ�");
	static TextArea ta = new TextArea();
// ����ƥ��ť�̩M�֦��ƥ�B�z��
	static class myListener implements ActionListener{		// �������O
		public void actionPerformed(ActionEvent event) {	// �ƥ�B�z��
			MenuItem item = (MenuItem) event.getSource();	// ���o�ҫ��ﶵ
			if (item == open) {								// �p�GtrueŪ�ɮ�
				fd.setVisible(true);						// ����ɮ׹�ܤ��
				String fileName = fd.getDirectory()+fd.getFile(); // �ҿ諸�ɮ�
				try {		
					FileInputStream src = new FileInputStream(fileName);					
					byte[] fn = new byte[src.available()];	// �إ�fn�}�C			
					src.read(fn);				// �q��J��yŪ����Ʀs�Jfn�}�C
					ta.setText(new String(fn));				// �g�J��r��
					src.close();					
				}			
				catch (IOException e) {
					System.out.println(e);	
				}
			}
		}
	}		
	public static void main(String[] args) {
		mb.add(menu);								// �bMenuBar�[�JFile Menu		
		menu.add(open);								// �Nopen�[�JFile Menu		
		open.addActionListener(new myListener());	// ���U
		BorderLayout br = new BorderLayout();		// �����t�m�榡
		frm.add(ta,br.CENTER);						// ��r�Ϧb����
		frm.setSize(200, 160);						// �e200, ��160
		frm.setMenuBar(mb);							// �]�wfrm�\���Omb����
		frm.setVisible(true);						// ��ܵ���
	}
}

