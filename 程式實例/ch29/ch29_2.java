import javax.swing.*;						// �פJ���O�w
import java.awt.*;							// Image�ϥ�
public class ch29_2 {	
	static JFrame jfrm = new JFrame("ch29_2");
	public static void main(String[] args) {
		jfrm.setSize(200, 160);				// �e200, ��160
// �Nstar.gif�নImage����im
		Image im = Toolkit.getDefaultToolkit().getImage("star.gif");
		jfrm.setIconImage(im);				// ���ϥ�
// setDefaultCloseOperation()�i�H���ϥΪ̫������îɵ����{��
		jfrm.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm.setVisible(true);				// ��ܵ���
	}
}

