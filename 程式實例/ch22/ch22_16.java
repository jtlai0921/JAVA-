import java.io.*;
public class ch22_16 {	
    public static void main(String args[]) throws IOException {
		FileOutputStream fo = new FileOutputStream("ch22_16.txt");
		PrintStream ps = new PrintStream(fo);
		String str = "�����k��";
		ps.println(str);						// ��X�r����
		ps.println("Java�J���ڦV���⤧��");		// ��X�r����
		ps.println("�@��:�x�A��");				// ��X�r����
		int age = 35;
		ps.println("�@�̤��~ " + age + " ��");	// ��X��Ƹ��
		ps.close();
		fo.close();
		System.out.println("��X���\!"); 		// �o�O��X��ù�
	}
}

