import java.io.*;
import java.util.zip.*;
public class ch23_4 {
    public static void main(String[] args) throws IOException {
		File mydir = new File("myDir");				// �إߦs������Y�ɮת���Ƨ�
		if (mydir.mkdir())							// �����إ�
			System.out.println(mydir.getName() + "�x�s�����Y�ɮת���Ƨ��إߦ��\");
		else
			System.out.println(mydir.getName() + "��Ƨ��w�s�b�إߥ���");
		
        String srcZip = "ch23_3.zip";				// �Q�n�����Y���ɮ�
        byte[] buffer = new byte[1024];				// �C���B�z�ƶq�}�C
        ZipInputStream src = new ZipInputStream(new FileInputStream(srcZip));
        ZipEntry zipEntry = src.getNextEntry();
        while(zipEntry != null){					// �p�G���Onull�h�����Y
            String fName = zipEntry.getName();		// ���o�������Y���ɮצW��
            File nName = new File(mydir + "/" + fName);	// �]�w�����Y���G�����|�M�ɦW
            FileOutputStream dst = new FileOutputStream(nName);	// �ŧi��X����
            int len;
            while ((len = src.read(buffer)) > 0) {
                dst.write(buffer, 0, len);			// ��ڼg�J
            }
            dst.close();
            zipEntry = src.getNextEntry();
        }
        src.close();
    }
}
