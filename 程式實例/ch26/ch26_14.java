import java.awt.*;								// �פJ���O�w
public class ch26_14 {	
	static Frame frm = new Frame("ch26_14");		
	public static void main(String[] args) {
		BorderLayout obj =  new BorderLayout(4, 2);	
		frm.setLayout(obj);						// �]�w�����t�m�覡
		frm.setSize(300, 200);					// �e300, ��200
		frm.add(new Button("�F"), obj.EAST);
		frm.add(new Button("��"), obj.WEST);
		frm.add(new Button("��"), obj.CENTER);
		frm.setVisible(true);					// ��ܵ���		
	}
}

