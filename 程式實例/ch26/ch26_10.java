import java.awt.*;							// �פJ���O�w
public class ch26_10 {	
	static Frame frm = new Frame("ch26_10");
	static TextArea txt = new TextArea("TextArea",2,20,
						TextArea.SCROLLBARS_VERTICAL_ONLY);
	public static void main(String[] args) {
		frm.setLayout(null);				// ���������t�m
		frm.setSize(300, 200);				// �e300, ��200
		frm.setBackground(Color.yellow); 	// �����I���O����
		txt.setBounds(30, 40, 150, 50);		// ��r�Ϧ�m�P�j�p
		frm.add(txt);						// �Ntxt�[�J����						
		frm.setVisible(true);				// ��ܵ���		
	}
}

