import java.awt.*;							// �פJ���O�w
public class ch26_6 {	
	static Frame frm = new Frame("ch26_6");
	static Label lab1 = new Label();		// Labe����lab1
	static Label lab2 = new Label();		// Labe����lab2
	public static void main(String[] args) {
		frm.setLayout(null);				// ���������t�m
		frm.setSize(300, 200);				// �e300, ��200
		frm.setBackground(Color.yellow); 	// �����I���O����
		lab1.setText("Java");				// �]�w��rJava
		lab1.setForeground(Color.blue);		// ��r�O�Ŧ�
		lab1.setBounds(50, 50, 100, 30);	// �]�w��r��m�P�j�p
		lab2.setText("Python");				// �]�w��rPython
		lab2.setForeground(Color.green);	// ��r�O���
		lab2.setBounds(50, 100, 100, 30);	// �]�w��r��m�P�j�p		
		frm.add(lab1);						// �N����lab1�[�J����
		frm.add(lab2);						// �N����lab2�[�J����					
		frm.setVisible(true);				// ��ܵ���
		
	}
}

