public class ch12_26 {
	public static void main(String[] args) {
		String str1 = "���Ӭ�ޤj��";
		StringBuffer bstr1 = new StringBuffer(str1);
		System.out.println(bstr1);
		StringBuffer bstr2 = new StringBuffer("���Ӭ�ޤj��");
		System.out.println(bstr2);
		CharSequence str2 = "�x�W��ޤj��";
		StringBuffer bstr3 = new StringBuffer(bstr2);
		System.out.println(bstr3);		
	}
}

