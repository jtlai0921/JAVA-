import java.io.*;
public class ch22_14 {	
    public static void main(String args[]) throws IOException {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		String str = "str";								// �ȩw�r�ꤺ�e
		System.out.println("��Jq�h�{������ ");
		while (!str.equals("q")) {						// q�j�鵲��
			System.out.print("�п�J�W�r : ");
			str = br.readLine();						// Ū�������
			System.out.println("�A����J�O : " + str);	// ��X��Ū�������	
		}
	}
}

