import java.awt.*;								// �פJ���O�w
public class ch26_17 {	
	static Frame frm = new Frame("ch26_17");		
	public static void main(String[] args) {
		FlowLayout obj =  new FlowLayout(FlowLayout.CENTER,4,8);		
		frm.setLayout(obj);						// �]�w�����t�m�覡
		frm.setSize(300, 200);					// �e300, ��200
		frm.add(new TextField("Java", 5));
		frm.add(new TextField("�J���ڦV���⤧��", 10));
		frm.add(new TextField("�����k��", 5));
		frm.add(new TextField("�`�ۼƦ��ުѥ��������q", 16));
		frm.setVisible(true);					// ��ܵ���		
	}
}

