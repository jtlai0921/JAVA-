import java.net.*;									// �פJ���O�w
public class ch31_1 { 
	public static void main(String[] args){ 
		try {
			InetAddress ip =  InetAddress.getLocalHost();
			System.out.println("�D���W�� : " + ip.getHostName());
			System.out.println("IP��}   : " + ip.getHostAddress());
			System.out.println(ip);
		}
		catch(UnknownHostException e) 
		{
			System.out.println(e);
		}
	}
}


