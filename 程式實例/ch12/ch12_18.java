public class ch12_18 {
	public static void main(String[] args) {
		String str1 = " Ming-Chi Institute of Technology ";
		String str2 = " ����L�Q�O���L�P�������G�� ";
		String str3 = "\t�j�L���L\n";
		System.out.printf("�ϥ�trim�estr1=/%s/\n", str1);
		String str4 = str1.trim();
		System.out.printf("�ϥ�trim��str4=/%s/\n", str4);
		System.out.printf("�ϥ�trim�estr2=/%s/\n", str2);
		String str5 = str2.trim();
		System.out.printf("�ϥ�trim��str5=/%s/\n", str5);
		System.out.printf("�ϥ�trim�estr3=/%s/\n", str3);
		String str6 = str3.trim();
		System.out.printf("�ϥ�trim��str6=/%s/\n", str6);
	}
}

