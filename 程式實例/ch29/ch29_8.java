import javax.swing.*;								// �פJ���O�w
import java.awt.*;										
public class ch29_8 {	
	static JFrame jfrm = new JFrame("ch29_8");
	static Container ct  = jfrm.getContentPane();	// ���o���e���檫��
	static JLabel lab = new JLabel();				// �w�q����		
// �w�q���s�ϥܩM���s
	static ImageIcon arrowLeft =  new ImageIcon("arrowleft.gif");
	static ImageIcon arrowRight =  new ImageIcon("arrowright.gif");	
	static JButton btn1 = new JButton("Prev", arrowLeft);	// ���e
	static JButton btn2 = new JButton("Next", arrowRight);	// ����	
	public static void main(String[] args) {
		ct.setLayout(new FlowLayout());				// �]�w�y�ʪ����t�m		
// �]�w���ҩM�ϥ�
		ImageIcon labfig = new ImageIcon("snow0.jpg");	// �Φb���Ҫ��ϥ�
		lab.setIcon(labfig);							// �w�]��ܹϥ�
		lab.setText("snow0.jpg");
		lab.setHorizontalTextPosition(JLabel.CENTER);	// ������ܹϥܤ�������
		lab.setVerticalTextPosition(JLabel.TOP);		// ������ܹϥܫ����W��	
// �]�w�\���btn2��Next�r���b�ϥܪ�����
		btn2.setHorizontalTextPosition(JButton.LEFT);	// �bNext�r��k���ϥ�
// �N�����J���e����		
		ct.add(lab);								// �b���e����إ߼���
		ct.add(btn1);								// �b���e����إ߫��s
		ct.add(btn2);								// �b���e����إ߫��s
// �]�w�����j�p�M�i�H��ܻP�����{��					
		jfrm.setSize(800, 580);						// �e800, ��580
		jfrm.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm.setVisible(true);						// ��ܵ���
	}
}

