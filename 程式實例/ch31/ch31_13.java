import java.net.*;											// �פJ���O�w	
import java.io.*;							
public class ch31_13 { 
	public static void main(String[] args) throws Exception { 
        int port = 2255;									// ������port
		byte[] buf = new byte[1024];						// byte�}�C
		System.out.println("�����ݵ{�����椤 ... ");
// �����ݺݳ]�p
		while (true) {
            DatagramSocket socket = new DatagramSocket(port);	// �إ�socket
			DatagramPacket data = new DatagramPacket(buf,buf.length);			
			socket.receive(data);
			String msg = new String(buf,0,data.getLength());
            System.out.println("�ǨӪ��T�� : " + msg);		// ��X�ǨӪ����
			socket.close();
        }
	}
}
