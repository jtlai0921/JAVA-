public class ch12_30 {
	public static void main(String[] args) {
		String str = "Java �J���ڦV���⤧�������k��";
		StringBuffer bstr = new StringBuffer(str);		
		System.out.println("bstr : " + bstr);
		bstr.setCharAt(4, '9');
		System.out.println("bstr : " + bstr);
		bstr.replace(5,7, "�ּ־ǲ�");
		System.out.println("bstr : " + bstr);
	}
}
	
