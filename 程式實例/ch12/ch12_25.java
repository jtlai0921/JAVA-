public class ch12_25 {
	public static void main(String[] args) {
		char c = 'A';
		String str1 = String.valueOf(c);	// �r����r��
		int i = 55;
		String str2 = String.valueOf(i);	// �����r��
		long l = 66L;
		String str3 = String.valueOf(l);	// �������r��
		float f = 5.5f;
		String str4 = String.valueOf(f);	// �B�I����r��
		double d = 6.6;
		String str5 = String.valueOf(d);	// ������ׯB�I����r��
		boolean b = true;
		String str6 = String.valueOf(b);	// ���L����r��
		System.out.printf("%s%s%s%s%s%s\n",str1,str2,str3,str4,str5,str6);
		String str = str1+str2+str3+str4+str5+str6;		// �r�ꪺ�걵
		System.out.println(str);
	}
}

