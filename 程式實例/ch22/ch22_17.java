import java.io.*;
public class ch22_17 {	
    public static void main(String args[]) {
		Console cs = System.console();
		cs.printf("�п�J�b�� : ");				// ���ܰT��
		String account = cs.readLine( );		// Ū���b��
		cs.printf("%s �w��^��!", account);		// ��X�w���
	}
}

