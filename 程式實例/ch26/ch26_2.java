import java.awt.*;							// �פJ���O�w
public class ch26_2 {	
	static Frame frm = new Frame("ch26_2");
	public static void main(String[] args) {
		frm.setSize(200, 152);				// �e200, ��152
		frm.setBackground(Color.yellow);	// �����I���O����
		frm.setLocation(200, 100);			// ���W���y��(200, 100)
		frm.setVisible(true);				// ��ܵ���
		frm.setName("myWin");				// �����W��
// ���o�������A��
		System.out.println("����x�b�y�� : " + frm.getX());
		System.out.println("����y�b�y�� : " + frm.getY());
		System.out.println("��������    : " + frm.getHeight());
		System.out.println("�����e��    : " + frm.getWidth());
		System.out.println("�����W��    : " + frm.getName());
		System.out.println("�����I����  : " + frm.getBackground());
	}
}

