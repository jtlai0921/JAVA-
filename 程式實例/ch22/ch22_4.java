import java.io.*;
public class ch22_4 {	
    public static void main(String args[]){
		try {
			FileInputStream obj = new FileInputStream("ch22_2.txt");
			int b = obj.read();					// Ū��1��Byte���
			while ((b = obj.read()) != -1) {	// �O�_Ū���ɮץ���
				System.out.print((char) b); 	// Byte����ର�r����X
			}
			obj.close();
			System.out.println("Ū�����\!"); 
		}			
		catch (IOException e) {
			System.out.println(e);						
		}	
	}
}

