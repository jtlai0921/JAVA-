import java.net.*;									// �פJ���O�w	
import java.io.*;							
public class ch31_8 { 
	public static void main(String[] args){ 
		String str;		
		try {
			URL url = new URL("https://aaa.24ht.com.tw/"); // ����       
			URLConnection uC = url.openConnection();	
			InputStream stream = uC.getInputStream();
			InputStreamReader isr = new InputStreamReader(stream,"UTF-8");
			BufferedReader br = new BufferedReader(isr);
			while ((str=br.readLine())!=null)		// Ū�����
				System.out.println(str);			// ��X
			br.close();								// ����
		} 
		catch(Exception e) 
		{
			System.out.println(e);
		}	
	}
}


