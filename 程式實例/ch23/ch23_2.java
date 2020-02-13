import java.io.*;
import java.util.zip.*;
public class ch23_2 {
    public static void main(String[] args) throws IOException {
		String[] srcFiles = { "ch23_1.txt", "ch23_2.txt" };
// �إ����Y�ت���m����
        FileOutputStream zipToSave = new FileOutputStream("ch23_2.zip");
        ZipOutputStream dst = new ZipOutputStream(zipToSave);
		for ( String srcFile:srcFiles ) {
// �إ߱����Y���ɮ�File������src
			File fileToZip = new File(srcFile);
			FileInputStream src = new FileInputStream(fileToZip);
// �b���Y�ɮפ����إ����Y����               
			ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
			dst.putNextEntry(zipEntry);		
// byte�覡Ū�X�����Y�ɮ�src����, �M��Hzip�榡�g�J��X��ydst����		
			byte[] bytes = new byte[1024];				// �]�w��byte�}�C�Ŷ�
			int length;									// ����Ū��byte��
			while((length = src.read(bytes)) >= 0) {
				dst.write(bytes, 0, length);			// �Hzip�榡�g�J��X��y
			}
			src.close();		// ������J��y
		}
        dst.close();			// ������X��y    
    }
}

