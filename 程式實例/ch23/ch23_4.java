import java.io.*;
import java.util.zip.*;
public class ch23_4 {
    public static void main(String[] args) throws IOException {
		File mydir = new File("myDir");					// �إߦs������Y�ɮת���Ƨ�
		if (mydir.mkdir())								// �����إ�
			System.out.println(mydir.getName() + "�x�s�����Y�ɮת���Ƨ��إߦ��\");
		else
			System.out.println(mydir.getName() + "��Ƨ��w�s�b�إߥ���");
		
		byte[] buffer = new byte[1024];					// �C���B�z�}�C�Ŷ��j�p�O1024
        FileInputStream srcFile = new FileInputStream("ch23_3.zip");//�ӷ��ɮצ�y����
        ZipInputStream src = new ZipInputStream(srcFile); // �إ�ZipInputStream����
        ZipEntry zipEntry = src.getNextEntry();			// Ū�����Y�ɮפ�������
        while(zipEntry != null){						// �p�G���Onull�h�����Y
            String fName = zipEntry.getName();			// ���o�������Y���ɮצW��
            File nName = new File(mydir + "/" + fName);	// �]�w�����Y���G�����|�M�ɦW
            FileOutputStream dst = new FileOutputStream(nName);	// �ŧi��X����
            int len;
            while ((len = src.read(buffer)) > 0) {		// Ū��zip�榡���ɮ�
                dst.write(buffer, 0, len);				// �δ��q�榡��X
            }
            dst.close();								// ������X��y
            zipEntry = src.getNextEntry();				// ���o�U�@�ӳQ���Y�ɮת�����
        }
        src.close();									// ������J��y
    }
}

