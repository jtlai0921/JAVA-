import java.io.*;
public class ch22_18 {	
    public static void main(String args[]) {
		Console cs = System.console();
		cs.printf("�п�J�K�X : ");					// ���ܰT��
		char[] ch = cs.readPassword();				// Ū���K�X
		String pwd = String.valueOf(ch);			// �r���}�C�ন�r��
		cs.printf("�A�ҿ�J���K�X�O : %s", pwd);	// ��X�K�X
	}
}

