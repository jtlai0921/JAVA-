import java.io.*;
public class ch22_11 {	
    public static void main(String args[]) throws IOException {
		FileWriter writer = new FileWriter("ch22_11.txt");
		BufferedWriter bw = new BufferedWriter(writer);
		String str = "���Ӭ�ޤj���w��A��";
		bw.write(str, 0, 6);					// ��X�����r����
		bw.newLine();							// �g�X����Ÿ�
		bw.write(str, 6, str.length()-6);		// ��X�����r����
		bw.close();
		System.out.println("��X���\!"); 
	}
}

