import java.awt.*;							// �פJ���O�w
public class ch26_12 {	
	static Frame frm = new Frame("ch26_12");
	static Checkbox cb1 = new Checkbox("��s��");
	static Checkbox cb2 = new Checkbox("�j��");
	static Checkbox cb3 = new Checkbox("����");
	public static void main(String[] args) {
		CheckboxGroup cbg = new CheckboxGroup();	// �إ߿ﶵ�øs��
		frm.setLayout(null);				// ���������t�m
		frm.setSize(300, 200);				// �e300, ��200
		frm.setBackground(Color.yellow); 	// �����I���O����
		cb1.setBounds(30, 50, 150, 50);		// �֨����cb1��m�P�j�p
		cb2.setBounds(30, 90, 150, 50);		// �֨����cb2��m�P�j�p
		cb3.setBounds(30, 130, 150, 50);	// �֨����cb3��m�P�j�p
		cb1.setCheckboxGroup(cbg);			// �Ncb1�[�J�s��cbg	
		cb2.setCheckboxGroup(cbg);			// �Ncb2�[�J�s��cbg
		cb3.setCheckboxGroup(cbg);			// �Ncb3�[�J�s��cbg
		cb1.setState(true);					// �]�w�w�]�ﶵ�Ocb1
		frm.add(cb1);						// �Ncb1�[�J����
		frm.add(cb2);						// �Ncb2�[�J����
		frm.add(cb3);						// �Ncb3�[�J����		
		frm.setVisible(true);				// ��ܵ���		
	}
}

