import java.io.*;
public class ch22_22 {	
    public static void main(String args[]) throws IOException {
// �R���ɮ�
		File f = new File("mych22_21.txt");					// �إ�File����
		boolean bool = f.delete();
		System.out.println("�R���ɮצ��\   : " + bool);		// �R���ɮצ��\
// �R����Ƨ�(�κ٥ؿ�)
		File fd = new File("mydir22_21");					// �إ�File����
		bool = fd.delete();
		System.out.println("�R����Ƨ����\ : " + bool);		// �R����Ƨ����\
	}
}

