import java.io.*;
public class ch22_20 {	
    public static void main(String args[]) throws IOException {
		File f = new File("ch22_19.txt");					// �إ�File����
		System.out.println("�ɮצs�b : " + f.exists());  	// �����ɮ׬O�_�s�b
		System.out.println("�ɮצW�� : " + f.getName());	// ��X�ɮצW��
		System.out.println("�����|   : " + f.getParent());	// ��X�����|
	}
}

