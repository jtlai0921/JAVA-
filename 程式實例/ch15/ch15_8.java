class MyClass {
}
public class ch15_8 {
	public static void main(String[] args) {
		char[] ch = {'��', '��', '��', '��', '�j', '��'};
		String str = new String(ch);			
		MyClass obj = new MyClass();
		System.out.println("ch ���O : " + str.getClass());
		System.out.println("obj���O : " + obj.getClass());
	}
}

