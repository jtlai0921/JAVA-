import java.io.*;
public class ch22_9 {	
    public static void main(String args[]){
		int i;
		try {
			FileReader fr = new FileReader("ch22_8.txt");
			while ( (i = fr.read()) != -1 ) {	// Ū�r�������ɮץ���
				char ch = (char) i;				// �N����ন�r��
				System.out.print(ch);			// ��X�r��
			}
			fr.close();
			System.out.println("\n��X���\!"); 
		}			
		catch (IOException e) {
			System.out.println(e);						
		}	
	}
}

