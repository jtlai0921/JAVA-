public class ch12_17 {
	public static void main(String[] args) {
		String str1 = "Mjng-Chj Institute of Technology";
		String str2 = "Ming-Chi Institute of Technology";
		String str3 = "����L�Q�O���L�P�������G��";
		String str4 = str1.replace('j', 'i');					// �r�����N
		String str5 = str2.replace("Institute", "University");	// �r����N
		String str6 = str3.replace("����", "�p�s�k");			// ����r����N
		System.out.println("str4 = " + str4);
		System.out.println("str5 = " + str5);
		System.out.println("str6 = " + str6);
	}
}

