import javax.swing.*;								// �פJ���O�w
import java.awt.*;										
public class ch29_11 {	
	static JFrame jfrm = new JFrame("ch29_11");
	static Container ct  = jfrm.getContentPane();	// ���o���e���檫��
	static JCheckBox jcb1 = new JCheckBox("Travel",true); // �w�q�֨����
	static JCheckBox jcb2 = new JCheckBox();		// �w�q�֨����	
	public static void main(String[] args) {
		ct.setLayout(new FlowLayout());				// �]�w�y�ʪ����t�m		
// �]�w�֨����
		jcb2.setText("Reading");					// �]�w�֨�������e
		jcb2.setSelected(true);						// �Ŀ�֨����
		jcb1.setMnemonic('T');						// Alt+T�i�Ŀ�
		jcb2.setMnemonic('R');						// Alt+R�i�Ŀ�
// �N�����J���e����		
		ct.add(jcb1);								// �֨����
		ct.add(jcb2);								// �֨����
// �]�w�����j�p�M�i�H��ܻP�����{��					
		jfrm.setSize(200, 120);						// �e200, ��120
		jfrm.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm.setVisible(true);						// ��ܵ���
	}
}

