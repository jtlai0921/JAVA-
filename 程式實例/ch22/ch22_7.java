import java.io.*;
public class ch22_7 {	
    public static void main(String args[]){
		try {
			FileInputStream obj = new FileInputStream("ch22_6.txt");
			BufferedInputStream buf = new BufferedInputStream(obj);
			int b;								// �Ȯ��x�sbyte���
			while ((b = buf.read()) != -1) {
				System.out.print((char) b);		// Byte��ƿ�X��ù�
			}			
			buf.close();					
			obj.close();
			System.out.println("\nBufferedInputStream���զ��\!"); 
		}			
		catch (IOException e) {
			System.out.println(e);						
		}	
	}
}

