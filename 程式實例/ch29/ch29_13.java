import javax.swing.*;								// �פJ���O�w
import java.awt.*;										
public class ch29_13 {	
	static JFrame jfrm = new JFrame("ch29_13");
	static Container ct  = jfrm.getContentPane();	// ���o���e���檫��
	static JRadioButton jrb1 = new JRadioButton("�k��",true); // �w�q�ﶵ�s
	static JRadioButton jcb2 = new JRadioButton("�k��");	  // �w�q�ﶵ�s	
	public static void main(String[] args) {
		ct.setLayout(new FlowLayout());				// �]�w�y�ʪ����t�m				
// �N�����J���e����		
		ct.add(jrb1);								// �ﶵ�s
		ct.add(jcb2);								// �ﶵ�s
// �]�w�����j�p�M�i�H��ܻP�����{��					
		jfrm.setSize(200, 120);						// �e200, ��120
		jfrm.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm.setVisible(true);						// ��ܵ���
	}
}

