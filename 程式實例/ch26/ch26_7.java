import java.awt.*;							// �פJ���O�w
public class ch26_7 {	
	static Frame frm = new Frame("ch26_7");
	static Label lab = new Label("Java�����k��");	
	public static void main(String[] args) {
		frm.setLayout(null);				// ���������t�m
		frm.setSize(300, 200);				// �e300, ��200
		frm.setBackground(Color.yellow); 	// �����I���O����		
		lab.setForeground(Color.blue);		// ��r�O�Ŧ�
		lab.setBackground(Color.pink);		// ��r�I���O������
		lab.setAlignment(Label.CENTER);		// ��r�m��
		lab.setLocation(50, 80);			// �]�w��r�϶�
		lab.setSize(150, 50);				// �]�w��r�϶�
		lab.setFont(new Font("Serief", Font.BOLD+Font.ITALIC, 18));		
		frm.add(lab);						// �N����lab�[�J����						
		frm.setVisible(true);				// ��ܵ���		
	}
}

