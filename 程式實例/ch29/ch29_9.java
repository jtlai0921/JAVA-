import javax.swing.*;								// �פJ���O�w
import java.awt.*;
import java.awt.event.*;										
public class ch29_9 {	
	static JFrame jfrm = new JFrame("ch29_9");
	static Container ct  = jfrm.getContentPane();	// ���o���e���檫��
	static JLabel lab = new JLabel();				// �w�q����	
	static int index = 0;							// �w�q���ҹϥܯ���
	static ImageIcon[] labfig = new ImageIcon[3];	// �Φb���Ҫ��ϥܰ}�C
// �w�q���s�ϥܩM���s
	static ImageIcon arrowLeft =  new ImageIcon("arrowleft.gif");
	static ImageIcon arrowRight =  new ImageIcon("arrowright.gif");	
	static JButton btn1 = new JButton("Prev", arrowLeft);	// ���e
	static JButton btn2 = new JButton("next", arrowRight);	// ����
// ����ƥ��ť�̩M�֦��ƥ�B�z��
	static class myListener implements ActionListener{	// �������O
		public void actionPerformed(ActionEvent e) {	// �ƥ�B�z��
			JButton btn = (JButton) e.getSource();	// ��o���s
			int figLength = labfig.length;			// �ϥܼƶq
			if (btn==btn1 && index>0) 			// ��Prev�s�]�w�s����index��
				index--;
			if (btn==btn2 && index<figLength-1) // ��Next�s�]�w�s����index��
				index++;
			lab.setText("snow" + index + ".jpg");	// �]�w�s���ҹϥ�
			lab.setIcon(labfig[index]);				// �]�w�s���Ҧr��
		}
	}	
	public static void main(String[] args) {
		ct.setLayout(new FlowLayout());				// �]�w�y�ʪ����t�m		
// �]�w���ҩM�ϥ�
		labfig[0] = new ImageIcon("snow0.jpg");		// �ϥܯ���0
		labfig[1] = new ImageIcon("snow1.jpg");		// �ϥܯ���1
		labfig[2] = new ImageIcon("snow2.jpg");		// �ϥܯ���2
		lab.setIcon(labfig[0]);						// �w�]��ܹϥܯ���0
		lab.setText("snow0.jpg");
		lab.setHorizontalTextPosition(JLabel.CENTER);	// ��������
		lab.setVerticalTextPosition(JLabel.TOP);		// �����W��	
// �]�w�\���btn2��Next�r���b�ϥܪ�����
		btn2.setHorizontalTextPosition(JButton.LEFT);	// �bNext�r��k���ϥ�		
// �N�����J���e����		
		ct.add(lab);								// �b���e����إ߼���
		ct.add(btn1);								// �b���e����إ߫��s
		ct.add(btn2);								// �b���e����إ߫��s	
// ������U
		btn1.addActionListener(new myListener());		// --- ���U
		btn2.addActionListener(new myListener());		// --- ���U
// �]�w�����j�p�M�i�H��ܻP�����{��					
		jfrm.setSize(600, 480);						// �e600, ��480
		jfrm.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm.setVisible(true);						// ��ܵ���
	}
}

