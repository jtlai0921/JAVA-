import java.net.*;											// �פJ���O�w	
import java.io.*;							
public class ch31_12 { 
	public static void main(String[] args){ 
        String hostname = "localhost";						// �o�O��������
        int port = 2255;									// Server port
        try  {
// �إ߳s�u
			Socket socket = new Socket(hostname, port);		// �إ�socket
// ���oServer�ݸ��
            InputStream input = socket.getInputStream();	// �إ�input����
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            String line = reader.readLine();				// Ū�����
            System.out.println(line);						// ��XServer�ǨӪ����
        } catch (UnknownHostException ex) { 
            System.out.println("�䤣��Server : " + ex.getMessage());
        } catch (IOException ex) {
 
            System.out.println("I/O���~: " + ex.getMessage());
        }
	}
}


