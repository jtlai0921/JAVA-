import java.awt.*;							// �פJ���O�w
public class ch26_11 {	
	static Frame frm = new Frame("ch26_11");
	static Checkbox cb1 = new Checkbox("Java");
	static Checkbox cb2 = new Checkbox("Python");
	static Checkbox cb3 = new Checkbox("C++");
	public static void main(String[] args) {
		frm.setLayout(null);				// ���������t�m
		frm.setSize(300, 200);				// �e300, ��200
		frm.setBackground(Color.yellow); 	// �����I���O����
		cb1.setBounds(30, 50, 150, 50);		// �֨����cb1��m�P�j�p
		cb2.setBounds(30, 90, 150, 50);		// �֨����cb2��m�P�j�p
		cb3.setBounds(30, 130, 150, 50);	// �֨����cb3��m�P�j�p
		frm.add(cb1);						// �Ncb1�[�J����
		frm.add(cb2);						// �Ncb2�[�J����
		frm.add(cb3);						// �Ncb3�[�J����		
		frm.setVisible(true);				// ��ܵ���		
	}
}

