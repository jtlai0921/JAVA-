import java.awt.*;							// �פJ���O�w
public class ch28_2_1 {	
	static Frame frm = new Frame("ch28_2_1");
	static List lst = new List();
	public static void main(String[] args) {		
		frm.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));	
		frm.setSize(300, 160);				// �e300, ��160
		GraphicsEnvironment graphicsEnv = GraphicsEnvironment.getLocalGraphicsEnvironment();     
		String[] fontFamilyNames = graphicsEnv.getAvailableFontFamilyNames();	
		for (String fontFamilyName : fontFamilyNames) 		
			lst.add(fontFamilyName);		// �N�r���[�JList
		lst.select(0);						// ���index 0�r��
		frm.add(lst);						// �N���[�J����
		frm.setVisible(true);				// ��ܵ���
	}
}

