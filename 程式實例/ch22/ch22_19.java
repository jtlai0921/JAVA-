import java.io.*;
public class ch22_19 {	
    public static void main(String args[]) throws IOException {
		File f = new File("d:\\Java\\ch22\\ch22_19.txt");		// �إ�File����
		System.out.println("�ɮצs�b : " + f.exists());  		// �����ɮ׬O�_�s�b
		if (f.createNewFile()) {								// �إ߷s�ɮ�
			System.out.println("�ɮ׫إߦ��\");
			System.out.println("�ɮצs�b : " + f.exists());  	// �����ɮ׬O�_�s�b
			System.out.println("�ɦW     : " + f.getName());	// ��X�ɦW
			System.out.println("�����|   : " + f.getParent());	// �����|
			System.out.println("������| : " + f.getAbsolutePath());// ������|
			System.out.println("�O�ɮ�   : " + f.isFile());		// ���լO�_�ɮ�
			System.out.println("�O�ؿ�   : " + f.isDirectory());	// ���լO�_�ؿ�
			System.out.println("������| : " + f.isAbsolute());	// �O�_������|
			System.out.println("�iŪ     : " + f.canRead());	// �O�_�iŪ
			System.out.println("�i�g     : " + f.canWrite());	// �O�_�i�g
			System.out.println("�]��Ū   : " + f.setReadOnly());// �]��Ū
			System.out.println("�i�g     : " + f.canWrite());	// �O�_�i�g
			System.out.println("�]�iŪ�g : " + f.setWritable(true));	// �]�i�g
			System.out.println("�i�g     : " + f.canWrite());	// �O�_�i�g
		}
		else
			System.out.println("�ɮפw�s�b���ɥ���");			// ��X���ɥ���
	}
}

