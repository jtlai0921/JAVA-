import java.io.*;
import java.util.zip.*;
public class ch23_1 {
    public static void main(String[] args) throws IOException {
// �إ߱����Y���ɮ�File������src
		File fileToZip = new File("ch23_1.txt");				
		FileInputStream src = new FileInputStream(fileToZip);	
// �إ����Y�ت���m����
        FileOutputStream zipToSave = new FileOutputStream("ch23_1.zip");
        ZipOutputStream dst = new ZipOutputStream(zipToSave);
// �b���Y�ɮפ����إ����Y����               
        ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
        dst.putNextEntry(zipEntry);		
// byte�覡Ū�X�����Y�ɮ�src����, �M��Hzip�榡�g�J��X��ydst����		
        byte[] bytes = new byte[1024];				// �]�w��byte�}�C�Ŷ�
        int length;									// ����Ū��byte��
        while((length = src.read(bytes)) >= 0) {
            dst.write(bytes, 0, length);			// �Hzip�榡�g�J��X��y
        }
        dst.close();		// ������X��y
        src.close();		// ������J��y
    }
}

