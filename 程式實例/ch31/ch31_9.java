import java.net.*;									// �פJ���O�w	
import java.io.*;							
public class ch31_9 { 
	public static void main(String[] args){ 
		String str;		
		try {
// �U�C2��O��oHttpURLConnection���󪺤�k
			URL url = new URL("https://aaa.24ht.com.tw/");        
			HttpURLConnection huc = (HttpURLConnection) url.openConnection();	
			for (int i=1; i<=8; i++) {				// ���ohttp���������D��T
				System.out.println(huc.getHeaderFieldKey(i) +  " = " +
									huc.getHeaderField(i));
			}
			huc.disconnect();		
		} 
		catch(Exception e) 
		{
			System.out.println(e);
		}	
	}
}


