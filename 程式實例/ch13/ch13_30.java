import java.util.regex.*;
public class ch13_30 {
	public static void main(String[] args) {
		String msg = "Please call my secretary using 0930-919-919 or 0952-001-001";
		String pattern = "\\d{4}(-\\d{3}){2}";		// ���W��F��
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(msg);
		boolean found = false;						// �w�]found�Ofalse
		while (m.find()) {
			System.out.println(m.group()			// �C�X�ҧ�쪺�r��
							   + " �r����F�_�l���ެO " + m.start()
							   + " �פ���ެO " + m.end());
			found = true;							// ���F�ҥH�Otrue
		}
		if (!found) 								// �p�G�S���
			System.out.println("�j�M����");	  
	}	
}
	
