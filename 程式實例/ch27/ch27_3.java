import java.awt.*;							// �פJ���O�w
import java.awt.event.*;
public class ch27_3 {	
	static Frame frm = new Frame("ch27_3");
	static Button btn = new Button("�Ы���");	
	public static void main(String[] args) {
		frm.setLayout(new FlowLayout());	// �y�ʦ������t�m
		frm.setSize(200, 120);				// �e200, ��120
		frm.setBackground(Color.yellow); 	// �����I���O����	

		btn.addActionListener(new ActionListener() {		// ���U
			public void actionPerformed(ActionEvent e) {	// �ƥ�B�z��
				frm.setBackground(Color.gray);
			}
		});
		
		frm.add(btn);						// �N�\��s�[�J����						
		frm.setVisible(true);				// ��ܵ���	
	}	
}

