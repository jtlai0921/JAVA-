import java.io.*;
import java.util.zip.*;
public class ch23_3 {
    public static void main(String[] args) throws IOException {
// �إ߱����Y����Ƨ�File����fileToZip
		File fileToZip = new File("zip23");				
// �إ����Y�ت���m����
        FileOutputStream zipToSave = new FileOutputStream("ch23_3.zip");
        ZipOutputStream dst = new ZipOutputStream(zipToSave);
// �I�s��k�B�z��Ӹ�Ƨ������Y
		zipFile(fileToZip, fileToZip.getName(), dst);
		dst.close();								// ������X��y
	}
// Recursive function
	private static void zipFile(File fileToZip, String fileName, 
								ZipOutputStream dst) throws IOException {
		if (fileToZip.isHidden()) {					// �p�G�����ɮ׫h�����Y
            return;
        }
        if (fileToZip.isDirectory()) {				// �p�G�O��Ƨ��h�B�z
            File[] files = fileToZip.listFiles();	// ��o��Ƨ����Ҧ��ɮ�
            for (File file:files) {
                zipFile(file, fileName + "/" + file.getName(), dst);
            }
            return;
        }
// �p�GfileToZip���O�����ɮפ]���O��Ƨ��h�������Y�B�z
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
}
