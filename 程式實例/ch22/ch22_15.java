import java.io.IOException;
public class ch22_15 {	
    public static void main(String args[]){
		int ch;
		System.out.println("��X�@��T�� "); 	// System.out
		System.err.println("��XERR�T��  ");	// System.err
		try {
			System.out.println("�п�J�@�Ӧr�� "); 	
			ch = System.in.read();				// System.in, ��^�r�����X��
			System.out.println(ch);				// �C�L�X��
		}										
		catch (IOException e) {
			System.out.println(e);						
		}	
	}
}

