import java.net.*;											// �פJ���O�w	
import java.io.*;
import java.util.*;							
public class ch31_11 { 
	public static void main(String[] args){ 
        int port = 2255;									// Server port
        try  {
// Server�ݪ��]�p
			ServerSocket serverSocket = new ServerSocket(port);
			System.out.println("Server�A�ȵ{�����b��ť port " + port);
			while (true) {
				Socket socket = serverSocket.accept();		
				System.out.println("Server�PClient�ݳs�u���\"); 
				OutputStream output = socket.getOutputStream();
				PrintWriter writer = new PrintWriter(output, true);
				writer.println("�{�b���" + new Date().toString());
			}
        } catch (IOException ex) { 
            System.out.println("I/O���~: " + ex.getMessage());
        }
	}
}


