import java.awt.*;									// �פJ���O�w
import java.awt.event.*;
public class ch30_2 extends Frame implements ActionListener {
	static ch30_2 frm = new ch30_2();		
	static Button btn = new Button("Rect");			// Rect�s
	public void actionPerformed(ActionEvent e) {	// �ƥ�B�z��
		Graphics g = getGraphics();					// ���oø�ϰϪ���g
		paint(g);
	}
	public void paint(Graphics g) {					// paint()��k
		g.drawRect(50,100,200,100);					// ø�s�x��
	}	
	public static void main(String[] args) {
		FlowLayout fl = new FlowLayout();
		frm.setLayout(fl);							// �y�ʦ������t�m
		frm.setTitle("ch30_2");						// �������D
		frm.setSize(300, 250);						// �e300, ��250
		frm.add(btn);								// �N�\��s�[�Jfrm
		btn.addActionListener(frm);					// ���U
		frm.setVisible(true);						// ��ܵ���
	}
}

