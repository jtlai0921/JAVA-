import java.io.*;
public class ch22_2 {	
    public static void main(String args[]){
		try {
			FileOutputStream obj = new FileOutputStream("ch22_2.txt");
			String str = "���Ӭ�ޤj��MINGCHI University�w��A��";
			byte[] bArray = str.getBytes();		// �r���}�C�אּbyte�}�C
			obj.write(bArray);					// ��XByte�}�C���
			obj.close();
			System.out.println("��X���\!"); 
		}			
		catch (IOException e) {
			System.out.println(e);						
		}	
	}
}

