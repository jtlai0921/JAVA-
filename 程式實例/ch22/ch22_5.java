import java.io.*;
public class ch22_5 {	
    public static void main(String args[]){
		try {
			FileInputStream src = new FileInputStream("�x�A��1.jpg");
			FileOutputStream dst = new FileOutputStream("�x�A��2.jpg");
			
			System.out.println("�ɮפj�p : " + src.available()); 
			byte[] pic = new byte[src.available()];		// �إ�pic�}�C
			
			src.read(pic);			// �q��J��yŪ�����ɸ�Ʀs�Jpic�}�C
			dst.write(pic);			// �Npic�}�C��Ƽg���X��y
			src.close();
			dst.close();
			System.out.println("���ɫ���"); 
		}			
		catch (IOException e) {
			System.out.println(e);						
		}	
	}
}

