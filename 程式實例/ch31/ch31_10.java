import java.net.*;											// �פJ���O�w	
import java.io.*;							
public class ch31_10 { 
	public static void main(String[] args){ 
        String outstr = "google.com"; 						// �n�e��Server�����
        String hostname = "whois.internic.net";				// Server���}
        int port = 43;										// Server port
        try  {
// �إ߳s�u
			Socket socket = new Socket(hostname, port);		// �إ�socket
// �ǰe��Ƶ�Server			
            OutputStream output = socket.getOutputStream();	// �إ�output����
            PrintWriter writer = new PrintWriter(output, true);
            writer.println(outstr);							// �e�X���
// ���oServer�ݸ��
            InputStream input = socket.getInputStream();	// �إ�input����
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            String line;
            while ((line = reader.readLine()) != null) {	// Ū��Server�ǨӪ����
                System.out.println(line);					// ��XServer�ǨӪ����
            }
        } catch (UnknownHostException ex) { 
            System.out.println("�䤣��Server : " + ex.getMessage());
        } catch (IOException ex) {
 
            System.out.println("I/O���~: " + ex.getMessage());
        }
	}
}


