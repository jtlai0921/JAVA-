import java.awt.*;							// �פJ���O�w
public class ch26_3 {	
	static Frame frm = new Frame("ch26_3");
	public static void main(String[] args) {
		frm.setSize(200, 152);				// �e200, ��152
		frm.setBackground(new Color(255,255,0)); // �����I���O����
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

