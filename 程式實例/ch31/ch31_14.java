import java.net.*;											// �פJ���O�w	
import java.io.*;	
import java.util.Scanner;						
public class ch31_14 { 
	public static void main(String[] args) throws Exception { 
		Scanner scanner = new Scanner(System.in);
        int port = 2255;									// �����ݪ�port
		if (args.length < 1) {
			System.out.println("�п�JIP");
			return;
		}
		String receiverIP = args[0];						// �]�wIP
		InetAddress addr = InetAddress.getByName(receiverIP);
// �ǰe�ݪ��]�p
		while (true) {
			System.out.print("�D�����n : ");
			InputStreamReader ir = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(ir);
			String txt = br.readLine();			// Ū�������
			int txtLength = txt.length();		// �r�����
			byte[] buf = new byte[txtLength];	// �إ߫��w���ת�byte�}�C
			buf = txt.getBytes();				// �N�r��s��byte�}�C
			DatagramPacket datagram = new DatagramPacket(buf,txtLength,addr,port);
			DatagramSocket socket = new DatagramSocket();
			if (txt.equalsIgnoreCase("quit"))
				break;
			socket.send(datagram);
			socket.close();
		}
	}
}

