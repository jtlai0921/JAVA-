import java.awt.*;							// �פJ���O�w
public class ch26_8 {	
	static Frame frm = new Frame("ch26_8");
	static Button btn = new Button("Click me");	
	public static void main(String[] args) {
		frm.setLayout(null);				// ���������t�m
		frm.setSize(300, 200);				// �e300, ��200
		frm.setBackground(Color.yellow); 	// �����I���O����		
		btn.setBounds(100, 80, 100, 50);	// �]�w���s��m�P�j�p
		frm.add(btn);						// �Nbtn�[�J����						
		frm.setVisible(true);				// ��ܵ���		
	}
}

