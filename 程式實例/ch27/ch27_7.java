import java.awt.*;										// �פJ���O�w
import java.awt.event.*;								// �]����TextEvent
public class ch27_7 {	
	static Frame frm = new Frame("ch27_7");
	static TextArea ta1 = new TextArea("",10,40);		// �w�]��ܫ������b
	static TextArea ta2 = new TextArea("",10,40);		// �w�]��ܫ������b
// ����ƥ��ť�̩M�֦��ƥ�B�z��
	static class myListener implements TextListener{	// ��@TextListener
		public void textValueChanged(TextEvent e) {		// �ƥ�B�z��
			ta2.setText(ta1.getText());					// �ƻsta1���e��ta2
		}
	}
	public static void main(String[] args) {		
		frm.setLayout(new GridLayout(2, 1));			// ��檩���t�m
		frm.setSize(200, 140);							// �e200, ��140			
		ta1.addTextListener(new myListener());			// --- ���U
		ta2.setEditable(false);							// �]�����i�s��		
		ta2.setBackground(Color.yellow);				// ��r�I���O����		
		frm.add(ta1);									// �Ncb1�[�J����	
		frm.add(ta2);									// �Ncb2�[�J����		
		frm.setVisible(true);							// ��ܵ���	
	}	
}

