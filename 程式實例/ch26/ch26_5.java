import java.awt.*;							// �פJ���O�w
public class ch26_5 {	
	static Frame frm = new Frame("ch26_5");
	static Label lab = new Label("���Ӭ�ޤj��", Label.CENTER);
	public static void main(String[] args) {
		frm.setSize(300, 200);				// �e300, ��200
		frm.setBackground(Color.yellow); 	// �����I���O����
		lab.setForeground(Color.blue);		// ��r�O�Ŧ�
		frm.add(lab);						// �N���ҥ[�J����
		frm.setVisible(true);				// ��ܵ���
		
	}
}

