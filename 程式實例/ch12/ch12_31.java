public class ch12_31 {
	public static void main(String[] args) {
		String str = "Java �J���ڦV���⤧�������k��";
		StringBuffer bstr = new StringBuffer(str);
		char[] ch = {'�J', '��', '��', '��', '��', '�s', '��', '��'};
		bstr.getChars(7, 11, ch, 2);		
		System.out.print("bstr : ");
		for (char i:ch) 
			System.out.print(i);
	}
}
	
