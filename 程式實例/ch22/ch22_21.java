import java.io.*;
public class ch22_21 {	
    public static void main(String args[]) throws IOException {
// �إ��ɮ�
		File f = new File("ch22_21.txt");					// �إ�File����
		if (f.createNewFile()) 								// �إ߷s�ɮ�
			System.out.println(f.getName( ) + " �ɮ׫إߦ��\");
		else
			System.out.println("�ɮפw�s�b���ɥ���");		// ��X���ɥ���
// �إ߸�Ƨ�(�κ٥ؿ�)
		File fd = new File("dir22_21");						// �إ�File����
		if (fd.mkdir()) 									// �إ߷s��Ƨ�
			System.out.println(fd.getName() + " ��Ƨ��إߦ��\");
		else
			System.out.println("��Ƨ��w�s�b�إߥ���");		// �ظ�Ƨ�����
// ����ɮצW��		
		File newf = new File("mych22_21.txt");				// �إ߷sFile����
		boolean bool = f.renameTo(newf);					// ����ɦW
		System.out.println("����ɮצW�٦��\ : " + bool);	// �C�X�O�_���\
		System.out.println("�s�ɮצW�� : " + newf.getName());	
// ����Ƨ��W��		
		File newfd = new File("mydir22_21");				// �إ߷sFile����
		bool = fd.renameTo(newfd);							// ����Ƨ��W��
		System.out.println("���ꧨ�W�٦��\ : " + bool);	// �C�X�O�_���\
		System.out.println("�s��Ƨ��W�� : " + newfd.getName());
	}
}

