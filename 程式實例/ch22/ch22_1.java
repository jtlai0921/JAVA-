import java.io.*;
public class ch22_1 {	
    public static void main(String args[]){
		try {
			FileOutputStream obj = new FileOutputStream("D:\\Java\\ch22\\ch22_1.txt");
			obj.write(70);						// ��XByte���
			obj.close();
			System.out.println("��X���\!"); 
		}			
		catch (IOException e) {
			System.out.println(e);						
		}	
	}
}

