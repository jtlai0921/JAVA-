import java.io.*;
public class ch22_24 {	
    public static void main(String args[]) throws IOException {
		File[] paths;
		File f = new File("d:\\Java\\ch22");	// �إ�File����
		paths = f.listFiles();					// ���o�ɮשM�ؿ�
		for (File path:paths) 
			System.out.println(path);			// �C�L�ɮשM�ؿ��W��
	}
}

