import javax.swing.*;								// �פJ���O�w
import java.awt.*;										
public class ch29_14 {	
	static JFrame jfrm = new JFrame("ch29_14");
	static Container ct  = jfrm.getContentPane();	// ���o���e���檫��
	static JRadioButton rb1 = new JRadioButton("�k��",true); // �w�q�ﶵ�s
	static JRadioButton rb2 = new JRadioButton("�k��");	  	 // �w�q�ﶵ�s	
	public static void main(String[] args) {
		ct.setLayout(new FlowLayout());				// �]�w�y�ʪ����t�m	
		ButtonGroup bg = new ButtonGroup();			// �إ߸s��
		bg.add(rb1);								// �ﶵ�s1��J�s��
		bg.add(rb2);								// �ﶵ�s2��J�s��
// �N�����J���e����		
		ct.add(rb1);								// �ﶵ�s
		ct.add(rb2);								// �ﶵ�s
// �]�w�����j�p�M�i�H��ܻP�����{��					
		jfrm.setSize(200, 120);						// �e200, ��120
		jfrm.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm.setVisible(true);						// ��ܵ���
	}
}

