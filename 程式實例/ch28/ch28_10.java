import java.awt.*;									// �פJ���O�w
import java.awt.event.*;							// �]����Event
public class ch28_10 {	
	static Frame frm = new Frame("ch28_10");		
	static Scrollbar sc = new Scrollbar();			// �إ߫������b
	static Label lab = new Label();					// �إ߼���
// ����ƥ��ť�̩M�֦��ƥ�B�z��
	static class myListener implements AdjustmentListener{		
		public void adjustmentValueChanged(AdjustmentEvent e) {	
			lab.setText("�������b : " + sc.getValue());	// ���o���b��
		}
	}
	public static void main(String[] args) {
		frm.setLayout(null);						// ���]�����t�m
		sc.addAdjustmentListener(new myListener()); // ���U
		sc.setBounds(115,80,20,150);				// �]�w���b��m�P�j�p
		sc.setValues(50,10,0,100);					// �]�w���b������
		
		lab.setAlignment(Label.CENTER);				// �]�w���Ҹm�����
		lab.setBounds(50,50,150,20);				// �]�w���Ҧ�m�P�j�p
		lab.setText("�������b : " + sc.getValue());	// ��X����		
						
		frm.add(sc);								// �������b�[�J����
		frm.add(lab);								// ���ҥ[�J����
		frm.setSize(250, 250);						// �e250, ��250
		frm.setVisible(true);						// ��ܵ���
	}
}

