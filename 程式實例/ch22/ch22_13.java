import java.io.*;
public class ch22_13 {	
    public static void main(String args[]) throws IOException {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		System.out.print("�п�J�W�r : ");
		String name = br.readLine();			// ��Ū�������Ū���W�r
		System.out.println(name + "�w��A");	// ��X�w��T��		
	}
}

