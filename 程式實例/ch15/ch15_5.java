public class ch15_5 {
	public static void main(String[] args) {
		String str1 = "���Ӭ�j";								// �w�qString����str1
		StringBuilder strB1 = new StringBuilder(str1);			// �w�qStringBuilder����msg2	
		String str2 = new String("���Ӭ�j");					// �w�qString����str2
		StringBuilder strB2 = new StringBuilder(str2);			// �w�qStringBuilder����str2
		
		System.out.println("�ϥ�String���O��equals : " + str1.equals(str2));
		System.out.println("�ϥ�Object���O��equals : " + strB1.equals(strB2));	
	}
}

