import java.awt.*;							// �פJ���O�w
public class ch28_2 {	
	static Frame frm = new Frame("ch28_2");
	static List lst = new List();
	public static void main(String[] args) {		
		frm.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));	
		frm.setSize(200, 160);				// �e200, ��160
		for (int i=0; i < 6; i++) 			// �إ�index 0-5
			lst.add("Item" + i);			// �N���إ[�JList
		lst.select(0);						// ���index 0����
		frm.add(lst);						// �N���[�J����
		frm.setVisible(true);				// ��ܵ���
		System.out.println("Rows�ƶq : " + lst.getRows());
		System.out.println("Item�ƶq : " + lst.getItemCount());
	}
}

