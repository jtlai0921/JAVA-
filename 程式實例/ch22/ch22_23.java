import java.io.*;
public class ch22_23 {	
    public static void main(String args[]) throws IOException {
		String[] paths;
		File f = new File("d:\\Java\\ch22");	// �إ�File����
		paths = f.list();						// ���o�ɮשM�ؿ�
		for (String path:paths) 
			System.out.println(path);			// �C�L�ɮשM�ؿ��W��
	}
}

