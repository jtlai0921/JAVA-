import java.io.*;
public class ch22_8 {	
    public static void main(String args[]){
		try {
			FileWriter fw = new FileWriter("ch22_8.txt");
			String str = "���Ӭ�ޤj��MINGCHI University�w��A��";
			fw.write(str);					// ��XByte�}�C���
			fw.close();
			System.out.println("��X���\!"); 
		}			
		catch (IOException e) {
			System.out.println(e);						
		}	
	}
}

