import java.awt.*;										// �פJ���O�w
public class ch30_5 extends Frame {
	static ch30_5 frm = new ch30_5();			
	public void paint(Graphics g) {						// paint()��k
		Insets ins = getInsets();						// ���oø�ϰ�
		int width = getWidth() - (ins.left+ins.right);	// ���oø�ϰϼe��
		int height = getHeight() - (ins.top+ins.bottom);// ���oø�ϰϰ���
		System.out.println("����� : " + ins.left);
		System.out.println("�k��� : " + ins.right);
		System.out.println("�W��� : " + ins.top);
		System.out.println("�U��� : " + ins.bottom);		
		g.drawRect(ins.left,ins.top,width-1,height-1);	// ø�s�x��
	}	
	public static void main(String[] args) {
		frm.setTitle("ch30_5");							// �������D
		frm.setSize(200, 160);							// �e200, ��160	
		frm.setVisible(true);							// ��ܵ���
	}
}

