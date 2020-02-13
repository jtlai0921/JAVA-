import java.awt.*;									// �פJ���O�w
import javax.swing.*;
public class ch30_17 extends JComponent implements Runnable { 
	Thread t; 										//�����
	static boolean ballRun = true; 					//�O�_���� 
	static int x = 140, y = 110; 					//��̪�y��
	static int dx = 10; 							//����x�b�j�p
	static int xDir = 1; 							//���Ȫ�ܩ��U���� 
	static int dy = 10; 							//����y�b�j�p
	static int yDir = 1; 							//���Ȫ�ܩ��U���� 
	static int ballSize = 20;						//��j�p
	ch30_17(){ 
		t = new Thread(this); 						// �إߤ@�Ӱ����
		t.start(); 
	}	
	public void run() { 
		while(ballRun){ 
			repaint();								// ���sø�s
			try { 
				Thread.sleep(100); 					// ��0.1��
			} catch (InterruptedException e) { e.printStackTrace(); }
		} 
	}
	public void paint(Graphics g){ 
		if (y > (this.getSize().height  - ballSize)){ 	// �ϼu�yĲ��
			yDir = -1; 
		} 
		if (y <= 0){ 								// �ϼu�yĲ��
			yDir = 1; 
		} 
		if (x > (this.getSize().width  - ballSize)){ 	// �ϼu�yĲ�k
			xDir = -1; 
		} 
		if (x <= 0){ 								// �ϼu�yĲ��
			xDir = 1; 
		} 
		x += dx * xDir;								// �ϼu�yx��m
		y += dy * yDir; 							// �ϼu�yy��m
		g.setColor(Color.blue); 					// �]�w�ϼu�y�C��
		g.fillOval(x, y, ballSize, ballSize); 		// ø�s�ϼu�y
	} 
	public static void main(String[] args){ 
		JFrame frm = new JFrame("ch30_17"); 
		Container cp = frm.getContentPane(); 
		cp.add(new ch30_17());
		frm.setSize(300,240); 
		frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE); 
		frm.setVisible(true); 
	}
}