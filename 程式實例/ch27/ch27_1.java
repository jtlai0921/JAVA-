import java.awt.*;							// �פJ���O�w
public class ch27_1 {	
	static Frame frm = new Frame("ch27_1");
	static Button btn = new Button("�Ы���");	
	public static void main(String[] args) {
		frm.setLayout(new FlowLayout());	// �y�ʦ������t�m
		frm.setSize(200, 120);				// �e200, ��120
		frm.setBackground(Color.yellow); 	// �����I���O����				
		frm.add(btn);						// �N�\��s�[�J����						
		frm.setVisible(true);				// ��ܵ���		
	}
}

