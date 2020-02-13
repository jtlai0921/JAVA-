import java.awt.*;									// �פJ���O�w
import javax.swing.*;
public class ch30_16 extends JComponent implements Runnable { 
	Thread t; 										//�����
	static boolean ballRun = true; 					//�O�_���� 
	static int x = 140, y = 0; 						//��̪�y��		
	static int yDir = 1; 							//���Ȫ�ܩ��U���� 
	static int dy = 10; 							//���ʤj�p 
	static int ballSize = 20;						//��j�p
	ch30_16(){ 
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
		if (y > (this.getSize().height - ballSize)){ 	// �ϼu�yĲ��
			yDir = -1; 
		} 
		if (y <= 0){ 								// �ϼu�yĲ��
			yDir = 1; 
		} 
		y += dy * yDir; 							// �ϼu�yy��m
		g.setColor(Color.blue); 					// �]�w�ϼu�y�C��
		g.fillOval(x, y, ballSize, ballSize); 		// ø�s�ϼu�y
	} 
	public static void main(String[] args){ 
		JFrame frm = new JFrame("ch30_16"); 
		Container cp = frm.getContentPane(); 
		cp.add(new ch30_16());
		frm.setSize(300,240); 
		frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE); 
		frm.setVisible(true); 
	}
}


