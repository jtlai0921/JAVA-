import java.awt.*;								// �פJ���O�w
public class ch26_16 {	
	static Frame frm = new Frame("ch26_16");		
	public static void main(String[] args) {
		FlowLayout obj =  new FlowLayout(FlowLayout.RIGHT);		
		frm.setLayout(obj);						// �]�w�����t�m�覡
		frm.setSize(300, 200);					// �e300, ��200
		frm.add(new Button("1"));
		frm.add(new Button("2"));
		frm.add(new Button("3"));
		frm.add(new Button("4"));
		frm.add(new Button("5"));
		frm.add(new Button("6"));
		frm.setVisible(true);					// ��ܵ���		
	}
}

