import java.io.*;
public class ch22_10 {	
    public static void main(String args[]) throws IOException {
		int i;
		FileReader fr = new FileReader("ch22_8.txt");
		FileWriter fw = new FileWriter("ch22_10.txt");
		while ( (i = fr.read()) != -1 ) {	// Ū�r�������ɮץ���
			char ch = (char) i;				// �N����ন�r��
			fw.write(ch);					// ��X���ɮ�
		}
		fr.close();
		fw.close();
		System.out.println("�ƻs�ɮצ��\!"); 
	}
}

				