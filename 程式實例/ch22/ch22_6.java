import java.io.*;
public class ch22_6 {	
    public static void main(String args[]){
		try {
			FileOutputStream obj = new FileOutputStream("ch22_6.txt");
			BufferedOutputStream buf = new BufferedOutputStream(obj);
			String str = "Welcome to MINGCHI University of Technology";
			byte[] bArray = str.getBytes();		// �r���}�C�אּbyte�}�C
			buf.write(bArray);					// Byte�}�C��X��w�İ�
			buf.flush();						// �w�İϸ�Ƽg�J�ت��a
			obj.close();
			System.out.println("��X���\!"); 
		}			
		catch (IOException e) {
			System.out.println(e);						
		}	
	}
}

