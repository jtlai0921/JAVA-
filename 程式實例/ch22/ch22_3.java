import java.io.*;
public class ch22_3 {	
    public static void main(String args[]){
		try {
			FileInputStream obj = new FileInputStream("ch22_1.txt");
			int b = obj.read();				// Ū��1��Byte���
			System.out.println((char) b); 	// Byte����ର�r����X
			obj.close();
			System.out.println("Ū�����\!"); 
		}			
		catch (IOException e) {
			System.out.println(e);						
		}	
	}
}

