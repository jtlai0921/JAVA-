import java.net.*;										
public class ch31_3 { 
	public static void main(String[] args){ 
		try {
			URL url = new URL("https://aaa.24ht.com.tw/travel.jpg");        
			System.out.println("URL �O " + url.toString());
			System.out.println("protocol �O " + url.getProtocol());
			System.out.println("authority �O " + url.getAuthority());
			System.out.println("file name �O " + url.getFile());
			System.out.println("host �O " + url.getHost());
			System.out.println("path �O " + url.getPath());
			System.out.println("port �O " + url.getPort());
			System.out.println("default port �O " + url.getDefaultPort());
		} 
		catch(MalformedURLException e) 
		{
			System.out.println(e);
		}	
	}
}


