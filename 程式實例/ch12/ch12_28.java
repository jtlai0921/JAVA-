public class ch12_28 {
	public static void main(String[] args) {
		String str = "Java";
		char[] ch1 = {'�J', '��', '��', '�V', '��', '��', '��', '��'};
		char[] ch2 = {'��', '��', '�k', '��'};
		StringBuffer bstr = new StringBuffer(str);
		System.out.println("bstr : " + bstr);
		bstr.append('9');			// �᭱���J"9"
		System.out.println("bstr : " + bstr);
		bstr.append(ch2);			// �᭱���J"�����k��"
		System.out.println("bstr : " + bstr);		
// insert()��k������
		bstr.insert(5, ch1);		// ����5���J"�J���ڦV���⤧��"
		System.out.println("bstr : " + bstr);
// deleteCharAt()��k������
		bstr.deleteCharAt(14);		// �R��"��"
		System.out.println("bstr : " + bstr);
// delete()��k������
		bstr.delete(14, 16);		// �R��"�k��"
		System.out.println("bstr : " + bstr);
// �A��append()��k
		bstr.append(ch2, 1, 3);		// �W�["���k��"
		System.out.println("bstr : " + bstr);
	}
}
	
