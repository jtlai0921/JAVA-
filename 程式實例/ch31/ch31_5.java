import java.net.*;									// �פJ���O�w	
import java.io.*;							
public class ch31_5 { 
	public static void main(String[] args){ 
		String str;		
		try {
			URL url = new URL("https://aaa.24ht.com.tw/ch31Chinese.txt");        
			URLConnection uC = url.openConnection();	
			InputStream stream = uC.getInputStream();
			int i;
			while((i=stream.read())!=-1) {			// Ū���ɮת���̫�
				System.out.print((char) i);			// ��X��Ū�������
			}
		} 
		catch(Exception e) 
		{
			System.out.println(e);
		}	
	}
}


