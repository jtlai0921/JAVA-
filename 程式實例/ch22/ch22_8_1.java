import java.io.*;
public class ch22_8_1 {	
    public static void main(String args[]){
		try {
			FileWriter fw = new FileWriter("ch22_8.txt", true);
			fw.write('\n');					// �[�W����Ÿ�
			String str = "�s�_�����s�m";
			fw.write(str);					// ��XByte�}�C���
			fw.close();
			System.out.println("��X���\!"); 
		}			
		catch (IOException e) {
			System.out.println(e);						
		}	
	}
}

