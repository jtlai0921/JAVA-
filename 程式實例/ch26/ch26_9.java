import java.awt.*;							// �פJ���O�w
public class ch26_9 {	
	static Frame frm = new Frame("ch26_9");
	static TextField txt1 = new TextField("Editable");
	static TextField txt2 = new TextField("unEditable");
	static TextField txt3 = new TextField("marked by symbol");
	public static void main(String[] args) {
		frm.setLayout(null);				// ���������t�m
		frm.setSize(300, 200);				// �e300, ��200
		frm.setBackground(Color.yellow); 	// �����I���O����
		txt1.setBounds(30, 40, 150, 20);
		txt2.setBounds(30, 80, 150, 20);
		txt3.setBounds(30, 120, 150, 20);		
		txt2.setEditable(false);			// �]�wtxt2���i�s��
		txt3.setEchoChar('*');				// �]�wtxt3�H*���N��J
		frm.add(txt1);						// �Ntxt1�[�J����
		frm.add(txt2);						// �Ntxt2�[�J����
		frm.add(txt3);						// �Ntxt3�[�J����						
		frm.setVisible(true);				// ��ܵ���		
	}
}

