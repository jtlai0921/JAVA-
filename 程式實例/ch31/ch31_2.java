import java.net.*;										
public class ch31_2 { 
	public static void main(String[] args){ 
		try {
			InetAddress ip;
			ip = InetAddress.getByName("www.facebook.com");	// ���oIP
			System.out.println("�y��facebook IP : " + ip);
		}
		catch(UnknownHostException e) 
		{
			System.out.println(e);
		}
	}
}


