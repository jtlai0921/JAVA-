import java.awt.*;										// �פJ���O�w
import java.awt.event.*;								// �]����itemEvent
public class ch27_6 {	
	static Frame frm = new Frame("ch27_6");
	static Label lab1 = new Label("�п�ܧA�̷R���{���y��");
	static Label lab2 = new Label("�A�̷R���O :          ");
	static Checkbox cb1 = new Checkbox("Java");
	static Checkbox cb2 = new Checkbox("Python");
// ����ƥ��ť�̩M�֦��ƥ�B�z��
	static class myListener implements ItemListener{	// �������O
		public void itemStateChanged(ItemEvent e) {		// �ƥ�B�z��
			Checkbox cb = (Checkbox) e.getSource();		// ���o�ҫ��ﶵ
			if (cb == cb1)
				lab2.setText("�A�̷R���O : Java");
			else if(cb == cb2)
				lab2.setText("�A�̷R���O : Python");
		}
	}
	public static void main(String[] args) {		
		frm.setLayout(new FlowLayout(FlowLayout.LEFT));	// �y�ʦ������t�m
		frm.setSize(200, 130);							// �e200, ��130
		CheckboxGroup cbg = new CheckboxGroup();		// �إ߿ﶵ�øs��cbg
		cb1.setCheckboxGroup(cbg);						// �Ncb1�[�J�s��cbg
		cb2.setCheckboxGroup(cbg);						// �Ncb2�[�J�s��cbg		
		cb1.addItemListener(new myListener());			// --- ���U
		cb2.addItemListener(new myListener());			// --- ���U		
		lab2.setBackground(Color.yellow);				// ��r�I���O����		
		frm.add(lab1);									// �Nlab1�[�J����
		frm.add(cb1);									// �Ncb1�[�J����	
		frm.add(cb2);									// �Ncb2�[�J����
		frm.add(lab2);									// �Nlab2�[�J����
		frm.setVisible(true);							// ��ܵ���	
	}	
}

